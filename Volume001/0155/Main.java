import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      int[] b = new int[n];
      int[] x = new int[1001];
      int[] y = new int[1001];

      for (int i = 0; i < n; i++) {
        b[i] = scan.nextInt();
        x[b[i]] = scan.nextInt();
        y[b[i]] = scan.nextInt();
      }

      HashMap<Integer, LinkedList<Integer>> edge = new HashMap<>();
      for (int i = 0; i < n; i++) {
        LinkedList<Integer> list = new LinkedList<>();
        edge.put(b[i], list);
        for (int j = 0; j < n; j++) {
          if (i != j && Math.sqrt(Math.pow(x[b[i]] - x[b[j]], 2.) + Math.pow(y[b[i]] - y[b[j]], 2.)) <= 50.) {
            list.add(b[j]);
          }
        }
      }

      int m = scan.nextInt();
      for (int i = 0; i < m; i++) {
        int s = scan.nextInt();
        int g = scan.nextInt();

        double[] cost = new double[1001];
        int[] prev = new int[1001];
        for (int j = 0; j < 1001; j++) {
          cost[j] = Double.POSITIVE_INFINITY;
          prev[j] = -1;
        }
        cost[g] = 0;

        PriorityQueue<Data> queue = new PriorityQueue<>(Comparator.comparing(Data::getCost));

        queue.add(new Data(g, 0));
        while (!queue.isEmpty()) {
          Data d = queue.poll();
          if (!edge.containsKey(d.index)) continue;
          for (int j : edge.get(d.index)) {
            double newCost = d.cost + Math.sqrt(Math.pow(x[d.index] - x[j], 2) + Math.pow(y[d.index] - y[j], 2));
            if (newCost < cost[j]) {
              cost[j] = newCost;
              prev[j] = d.index;
              queue.add(new Data(j, newCost));
            }
          }
        }

        if (prev[s] == -1) {
          System.out.println("NA");
        } else {
          int j = s;
          while (j != g) {
            System.out.printf("%d ", j);
            j = prev[j];
          }
          System.out.println(j);
        }
      }
    }
  }

  static class Data {
    int index;
    double cost;

    Data(int index, double cost) {
      this.index = index;
      this.cost = cost;
    }

    double getCost() {
      return cost;
    }
  }
}
