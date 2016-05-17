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
      int m = scan.nextInt();
      if ((n | m) == 0) break;

      int[][] g = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          g[i][j] = 10001;
        }
      }

      for (int i = 0; i < m; i++) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        g[a][b] = g[b][a] = c;
      }

      int e = 0;
      boolean[] f = new boolean[n];
      f[0] = true;

      for (int k = 1; k < n; k++) {
        int mi = 0;
        int mc = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
          if (!f[i]) continue;
          for (int j = 0; j < n; j++) {
            if (!f[j] && g[i][j] < mc) {
              mi = j;
              mc = g[i][j];
            }
          }
        }

        f[mi] = true;
        e += mc;
      }

      System.out.println(e);
    }
  }
}
