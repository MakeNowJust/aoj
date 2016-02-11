import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int[] dp = new int[51];
    for (int i = 0; i <= 50; i++) dp[i] = Integer.MAX_VALUE;
    dp[0] = 0;
    int[][] pat = {
      {2    , 380},
      {3    , 550},
      {5    , 850},
      {2 * 5, 1520},
      {3 * 4, 1870},
      {5 * 3, 2244},
    };
    for (int i = 0; i <= 50; i++) {
      if (dp[i] == Integer.MAX_VALUE) continue;
      for (int j = 0; j < pat.length && i + pat[j][0] <= 50; j++) {
        dp[i + pat[j][0]] = Math.min(dp[i + pat[j][0]], dp[i] + pat[j][1]);
      }
    }

    for (;;) {
      int w = scan.nextInt() / 100;
      if (w == 0) break;
      System.out.println(dp[w]);
    }
  }
}
