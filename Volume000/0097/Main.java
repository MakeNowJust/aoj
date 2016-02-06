import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    long[][][] dp = new long[10][101][1001];
    for (int i = 0; i <= 100; i++) {
      dp[1][i][i] = 1;
    }

    for (int i = 2; i <= 9; i++) {
      for (int j = 0; j <= 100; j++) {
        for (int k = 0; k <= 1000; k++) {
          if (k - j >= 0) {
            for (int l = 1; l <= j; l++) {
              dp[i][j][k] += dp[i - 1][j - l][k - j];
            }
          }
        }
      }
    }

    for (;;) {
      int n = scan.nextInt();
      int s = scan.nextInt();
      if (n == 0 && s == 0) break;

      long ans = 0;
      for (int i = 0; i <= 100; i++) {
        ans += dp[n][i][s];
      }
      System.out.println(ans);
    }
  }
}
