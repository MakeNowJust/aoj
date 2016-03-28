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
      if (m == 0) break;

      int[] a = new int[m];
      int[] b = new int[m];
      for (int i = 0; i < m; i++) {
        a[i] = scan.nextInt();
        b[i] = scan.nextInt();
      }

      int[] dp = new int[1001];
      dp[0] = 1;
      for (int i = 0; i < m; i++) {
        int ai = a[i];
        int bi = b[i];
        for (int j = 1000; j >= 0; j--) {
          if (dp[j] == 0) continue;
          for (int k = 1; k <= bi && (j + ai * k) <= 1000; k++) {
            dp[j + ai * k] += dp[j];
          }
        }
      }

      int g = scan.nextInt();
      for (int i = 0; i < g; i++) {
        int n = scan.nextInt();
        System.out.println(dp[n]);
      }
    }
  }
}
