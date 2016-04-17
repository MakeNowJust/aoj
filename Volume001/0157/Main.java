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
  static int[] nh, nr, mh, mr;

  public static void main(String... args) {
    for (;;) {
      n = scan.nextInt();
      if (n == 0) break;
      nh = new int[n];
      nr = new int[n];
      for (int i = 0; i < n; i++) {
        nh[i] = scan.nextInt();
        nr[i] = scan.nextInt();
      }

      m = scan.nextInt();
      mh = new int[m];
      mr = new int[m];
      for (int i = 0; i < m; i++) {
        mh[i] = scan.nextInt();
        mr[i] = scan.nextInt();
      }

      int[] h = new int[n + m];
      int[] r = new int[n + m];
      for (int i = 0, j = 0, k = 0; k < n + m;) {
        while (i < n && (j >= m || nh[i] < mh[j] || nh[i] == mh[j] && nr[i] < mr[j])) {
          h[k] = nh[i];
          r[k] = nr[i];
          k += 1;
          i += 1;
        }

        if (j < m) {
          h[k] = mh[j];
          r[k] = mr[j];
          k += 1;
          j += 1;
        }
      }

      int ans = 0;
      int[] dp = new int[n + m];
      for (int i = 0; i < n + m; i++) {
        dp[i] = 1;
        for (int j = 0; j < i; j++) {
          if (h[j] < h[i] && r[j] < r[i]) {
            dp[i] = Math.max(dp[i], dp[j] + 1);
          }
        }
        ans = Math.max(ans, dp[i]);
      }

      System.out.println(ans);
    }
  }
}
