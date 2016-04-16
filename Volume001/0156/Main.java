import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int n, m;
  static int ans;
  static int[][] memo = new int[102][102];
  static char[][] d = new char[102][];
  static boolean[][] f = new boolean[102][102];

  static int[][] a = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

  public static void main(String... args) {
    for (;;) {
      m = scan.nextInt();
      n = scan.nextInt();
      if ((n | m) == 0) break;

      int tn = -1, tm = -1;
      for (int i = 1; i <= n; i++) {
        char[] l = scan.next().toCharArray();
        for (int j = 1; j <= m; j++) {
          memo[i][j] = Integer.MAX_VALUE;
          if (l[j - 1] == '&') {
            tn = i;
            tm = j;
          }
          f[i][j] = l[j - 1] == '#';
        }
      }
      for (int i = 0; i <= n + 1; i += n + 1) {
        for (int j = 0; j <= m + 1; j++) {
          memo[i][j] = Integer.MAX_VALUE;
          f[i][j] = false;
        }
      }
      for (int i = 0; i <= n + 1; i++) {
        for (int j = 0; j <= m + 1; j += m + 1) {
          memo[i][j] = Integer.MAX_VALUE;
          f[i][j] = false;
        }
      }

      ArrayDeque<Point> queue = new ArrayDeque<>();
      queue.add(new Point(tn, tm, 0));

      ans = Integer.MAX_VALUE;
      while (!queue.isEmpty()) {
        Point p = queue.remove();
        int cn = p.n;
        int cm = p.m;
        int v = p.v;

        if (v >= memo[cn][cm]) continue;
        memo[cn][cm] = v;

        if (cn == 0 || cn == n + 1 || cm == 0 || cm == m + 1) {
          ans = Math.min(ans, v);
          continue;
        }

        for (int i = 0; i < a.length; i++) {
          int dn = cn + a[i][0], dm = cm + a[i][1];
          int dv = v + (!f[cn][cm] && f[dn][dm] ? 1 : 0);
          queue.add(new Point(dn, dm, dv));
        }
      }

      System.out.println(ans);
    }
  }

  static class Point {
    int n, m, v;

    Point(int n, int m, int v) {
      this.n = n;
      this.m = m;
      this.v = v;
    }
  }
}
