import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    for (int s = 1; ; s++) {
      int W = scan.nextInt();
      if (W == 0) break;

      int n = scan.nextInt();
      int[] dp = new int[W+1];
      for (int i = 0; i < n; i++) {
        int v = scan.nextInt();
        int w = scan.nextInt();

        for (int j = W; j >= 0; j--) {
          if (j + w <= W) {
            dp[j + w] = Math.max(dp[j + w], dp[j] + v);
          }
        }
      }

      int mw = 0;
      for (int i = 0; i <= W; i++) {
        if (dp[mw] < dp[i]) {
          mw = i;
        }
      }
      System.out.printf("Case %d:\n", s);
      System.out.printf("%d\n", dp[mw]);
      System.out.printf("%d\n", mw);
    }
  }
}
