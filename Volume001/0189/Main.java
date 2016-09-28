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
      int n = scan.nextInt();
      if (n == 0) break;
      int[][] t = new int[10][10];
      boolean[] x = new boolean[10];
      for (int i = 0; i < 10; i++)
        for (int j = 0; j < 10; j++)
          t[i][j] = i == j ? 0 : 10000000;
      for (int i = 0; i < n; i++) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        x[a] = x[b] = true;
        t[a][b] = t[b][a] = c;
      }
      for (int j = 0; j < 10; j++)
        for (int i = 0; i < 10; i++)
          for (int k = 0; k < 10; k++)
            t[i][k] = Math.min(t[i][k], t[i][j] + t[j][k]);
      int min = Integer.MAX_VALUE;
      int ans = -1;
      for (int i = 0; i < 10; i++) {
        if (!x[i]) continue;
        int sum = 0;
        for (int j = 0; j < 10; j++)
          if (x[j])
            sum += t[i][j];
        if (sum < min) {
          min = sum;
          ans = i;
        }
      }
      System.out.printf("%d %d\n", ans, min);
    }
  }
}
