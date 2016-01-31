import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int n;
  static char[][] xs = new char[1000][];
  static int[][] dp = new int[1001][1001];

  public static void main(String[] args) {
    for (;;) {
      n = scan.nextInt();
      if (n == 0) break;

      int ans = 0;
      for (int i = 0; i < n; i++) {
        xs[i] = scan.next().toCharArray();

        for (int j = 0; j < n; j++) {
          if (xs[i][j] == '.') {
            dp[i + 1][j + 1] = Math.min(dp[i][j], Math.min(dp[i + 1][j], dp[i][j + 1])) + 1;
          } else {
            dp[i + 1][j + 1] = 0;
          }
          ans = Math.max(ans, dp[i + 1][j + 1]);
        }
      }

      System.out.println(ans);
    }
  }
}
