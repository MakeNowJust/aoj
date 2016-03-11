import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static final double EPS = 10e-6;

  public static void main(String... args) {
    int n = scan.nextInt();
    int[] ks = new int[n];
    int[] ds = new int[n];
    int[] ms = new int[n];
    for (int i = 0; i < n; i++) {
      ks[i] = scan.nextInt();
      ds[i] = scan.nextInt();
      ms[i] = scan.nextInt();
    }

    double[][] dp_t = new double[1 << n][n];
    int[][] dp_w = new int[1 << n][n];
    for (int i = 0; i < n; i++) {
      dp_t[1 << i][i] = 0;
      dp_w[1 << i][i] = ms[i] * 20;
    }

    for (int s = 0; s < (1 << n); s++) {
      for (int i = 0; i < n; i++) {
        if ((s & (1 << i)) == 0) continue;

        for (int j = 0; j < n; j++) {
          if ((s & (1 << j)) > 0) continue;

          int ns = s | (1 << j);
          int nw = dp_w[s][i] + ms[j] * 20;
          double nt = dp_t[s][i] + Math.abs(ds[i] - ds[j]) / (2000.0 / (70 + dp_w[s][i]));
          if (dp_w[ns][j] == 0 || dp_t[ns][j] - nt > EPS || Math.abs(dp_t[ns][j] - nt) < EPS && dp_w[ns][j] > nw) {
            dp_t[ns][j] = nt;
            dp_w[ns][j] = nw;
          }
        }
      }
    }

    int j = 0;
    double min = Double.POSITIVE_INFINITY;
    for (int i = 0; i < n; i++) {
      if (min > dp_t[(1 << n) - 1][i]) {
        j = i;
        min = dp_t[(1 << n) - 1][i];
      }
    }

    int[] ans = new int[n];
    ans[n - 1] = ks[j];
    for (int k = n - 2, s = (1 << n) - 1; k >= 0; k--) {
      int ps = s ^ (1 << j);
      for (int i = 0; i < n; i++) {
        int nw = dp_w[ps][i] + ms[j] * 20;
        double nt = dp_t[ps][i] + Math.abs(ds[i] - ds[j]) / (2000.0 / (70 + dp_w[ps][i]));
        if ((ps & (1 << i)) > 0 && nw == dp_w[s][j] && Math.abs(nt - dp_t[s][j]) < EPS) {
          j = i;
          s = ps;
          ans[k] = ks[j];
          break;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      System.out.printf("%d%s", ans[i], i == n - 1 ? "\n" : " ");
    }
  }
}
