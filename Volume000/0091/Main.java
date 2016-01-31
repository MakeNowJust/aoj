import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[][] xs = new int[10][];
  static int sum = 0;
  static int n;

  static int[][] ans = new int[12][3];

  public static void main(String[] args) {
    n = scan.nextInt();

    for (int i = 0; i < 10; i++) {
      xs[i] = new int[10];
      for (int j = 0; j < 10; j++) {
        sum += xs[i][j] = scan.nextInt();
      }
    }

    solve(0);
  }

  static int[] dx = {0, 1, 0};
  static int[] dy = {1, 1, 2};
  static int[] c = {5, 9, 13};
  static int[][] move = {
    // t = 0
    {0, 0},
    {1, 0},
    {0, 1},
    {-1, 0},
    {0, -1},
    // t = 1
    {1, 1},
    {-1, -1},
    {1, -1},
    {-1, 1},
    // t = 2
    {2, 0},
    {0, 2},
    {-2, 0},
    {0, -2},
  };

  static boolean solve(int k) {
    if (n == k) {
      if (sum == 0) {
        for (int i = 0; i < k; i++) {
          System.out.printf("%d %d %d\n", ans[i][0], ans[i][1], ans[i][2]);
        }
        return true;
      }
      return false;
    }

    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (xs[i][j] == 0) continue;
        for (int t = 0; t < 3; t++) {
          int cx = j + dx[t];
          int cy = i + dy[t];
          if (!fillCheck(cx, cy, t)) continue;
          fill(cx, cy, t, -1);

          ans[k][0] = cx;
          ans[k][1] = cy;
          ans[k][2] = t + 1;
          if (solve(k + 1)) return true;
          fill(cx, cy, t, 1);
        }

        return false;
      }
    }

    return false;
  }

  static boolean fillCheck(int cx, int cy, int t) {
    int len = c[t];

    for (int i = 0; i < len; i++) {
      int mx = cx + move[i][0];
      int my = cy + move[i][1];
      if (my < 0 || my >= 10 || mx < 0 || mx >= 10) return false;
      if (xs[my][mx] <= 0) return false;
    }

    return true;
  }

  static void fill(int cx, int cy, int t, int v) {
    int len = c[t];

    for (int i = 0; i < len; i++) {
      int mx = cx + move[i][0];
      int my = cy + move[i][1];
      xs[my][mx] += v;
      sum += v;
    }
  }
}
