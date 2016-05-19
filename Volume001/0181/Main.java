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
      int m = scan.nextInt();
      int n = scan.nextInt();
      if ((m | n) == 0) break;

      int[] w = new int[n];
      for (int i = 0; i < n; i++) {
        w[i] = scan.nextInt();
      }

      int[][] dp = new int[m][n];
      dp[0][0] = w[0];
      for (int i = 1; i < n; i++) {
        dp[0][i] = w[i] + dp[0][i - 1];
      }

      for (int i = 1; i < m; i++) {
        Arrays.fill(dp[i], Integer.MAX_VALUE);

        for (int j = i - 1; j < n; j++) {
          int ws = 0;
          dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
          for (int k = j + 1; k < n; k++) {
            ws += w[k];
            dp[i][k] = Math.min(dp[i][k], Math.max(dp[i - 1][j], ws));
          }
        }
      }

      System.out.println(dp[m - 1][n - 1]);
    }
  }
}
