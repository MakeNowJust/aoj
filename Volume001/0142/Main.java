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

      boolean[] e = new boolean[n];
      int[] f = new int[n];
      int l = 0;
      for (int i = 1; i <= n - 1; i++) {
        int i2 = (i * i) % n;
        if (!e[i2]) {
          f[l++] = i2;
          e[i2] = true;
        }
      }

      int m = (n - 1) / 2;
      int[] c = new int[m + 1];
      for (int i = 0; i < l; i++) {
        int x = f[i];
        for (int j = i + 1; j < l; j++) {
          int y = f[j];
          int xy = x - y;
          while (xy < 0 || m < xy) {
            if (xy < 0) xy = xy + n;
            if (xy > m) xy = n - xy;
          }
          c[xy] += 2;
        }
      }
      for (int i = 1; i <= m; i++) {
        System.out.println(c[i]);
      }
    }
  }
}
