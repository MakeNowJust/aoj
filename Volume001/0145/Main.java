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
    int[][] c = new int[n][2];
    for (int i = 0; i < n; i++) {
        c[i][0] = scan.nextInt();
        c[i][1] = scan.nextInt();
    }

    int[][] dp = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++) dp[i][j] = i == j ? 0 : Integer.MAX_VALUE;

    for (int d = 1; d < n; d++) {
      for (int i = 0; i < n - d; i++) {
        int j = i + d;
        for (int k = i; k < j; k++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j] + c[i][0] * c[k][1] * c[k + 1][0] * c[j][1]);
        }
      }
    }

    System.out.println(dp[0][n - 1]);
  }
}
