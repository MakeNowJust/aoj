import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[] now = new int[10];
  static double ansg;
  static int[] ans;

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      String[] f = new String[n];
      int[] w = new int[n];
      int[] s = new int[n];
      for (int i = 0; i < n; i++) {
        f[i] = scan.next();
        w[i] = scan.nextInt();
        s[i] = scan.nextInt();
      }

      ansg = Double.POSITIVE_INFINITY;
      find(0, 0, 0, n, w, s);

      for (int i = 0; i < n; i++) {
        System.out.println(f[ans[n - i - 1]]);
      }
    }
  }

  static void find(int l, int b, int ws, int n, int[] w, int[] s) {
    if (l == n) {
      double x = 0;
      for (int i = 0; i < n; i++) {
        x += (i + 1) * w[now[n - i - 1]];
      }
      x /= ws;
      if (x < ansg) {
        ansg = x;
        ans = Arrays.copyOf(now, now.length);
      }
      return;
    }

    for (int i = 0; i < n; i++) {
      if (((b >> i) & 1) == 0 && s[i] >= ws) {
        now[l] = i;
        find(l + 1, b | (1 << i), ws + w[i], n, w, s);
      }
    }
  }
}
