import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int[] dp = new int[5000];

    int n;
    for (;;) {
      n = scan.nextInt();
      if (n == 0) break;
      int ans = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++) {
        int a = scan.nextInt();
        if (i == 0) {
          dp[0] = a;
        } else {
          dp[i] = Math.max(dp[i - 1] + a, a);
        }
        ans = Math.max(ans, dp[i]);
      }
      System.out.println(ans);
    }
  }
}
