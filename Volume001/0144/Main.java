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
    int n = scan.nextInt();
    int[][] cost = new int[n + 1][n + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        cost[i][j] = 10000;
      }
    }

    for (int i = 0; i < n; i++) {
      int r = scan.nextInt();
      int k = scan.nextInt();
      for (int j = 0; j < k; j++) {
        int t = scan.nextInt();
        cost[r][t] = 1;
      }
    }

    for (int k = 1; k <= n; k++) {
      for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
          cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
        }
      }
    }

    int p = scan.nextInt();
    for (int i = 0; i < p; i++) {
      int s = scan.nextInt();
      int d = scan.nextInt();
      int v = scan.nextInt();
      int c = cost[s][d] + 1;
      System.out.println(c <= v ? Integer.toString(c) : "NA");
    }
  }
}
