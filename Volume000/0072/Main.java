import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      ArrayList<ArrayList<Route>> routes = new ArrayList<ArrayList<Route>>(n);
      for (int i = 0; i < n; i++) routes.add(new ArrayList<Route>());

      int m = scan.nextInt();
      for (int i = 0; i < m; i++) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int cost = scan.nextInt() / 100 - 1;
        routes.get(a).add(new Route(b, cost));
        routes.get(b).add(new Route(a, cost));
      }

      PriorityQueue<Route> queue = new PriorityQueue<Route>();
      HashSet<Integer> set = new HashSet<Integer>();
      int i = 0;
      int c = 0, cost = 0;
      do {
        if (!set.contains(i)) {
          cost += c;
          set.add(i);
          for (Route r : routes.get(i)) {
            queue.add(r);
          }
        }
        Route r = queue.poll();
        i = r.to;
        c = r.cost;
      } while (set.size() < n);

      System.out.println(cost);
    }
  }

  static class Route implements Comparable<Route> {
    public int to;
    public int cost;

    public Route(int to, int cost) {
      this.to = to;
      this.cost = cost;
    }

    public int compareTo(Route that) {
      return this.cost - that.cost;
    }
  }
}
