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
      int m = scan.nextInt();
      if (n == 0 && m == 0) break;
      double[][] g = new double[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++) g[i][j] = scan.nextDouble();
      double[] a = new double[n];
      for (int i = 0; i < n; i++) a[i] = 1.0;
      for (int k = 0; k < m - 1; k++) {
        double[] b = new double[n];
        for (int i = 0; i < n; i++)
          for (int j = 0; j < n; j++)
            b[j] = Math.max(b[j], a[i] * g[i][j]);
        a = b;
      }
      double ans = 0;
      for (int i = 0; i < n; i++) ans = Math.max(ans, a[i]);
      System.out.printf("%.2f\n", ans);
    }
  }
}
