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
    boolean[] ps = new boolean[1000001];
    int[] ss = new int[1000001];
    Arrays.fill(ps, true);
    ps[0] = ps[1] = false;
    for (int i = 2; i <= 1000000; i++) {
      ss[i] = ss[i - 1];
      if (ps[i]) {
        ss[i] += 1;
        for (int j = i * 2; j <= 1000000; j += i) ps[j] = false;
      }
    }
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      int c = 0;
      for (int i = 0; i < n; i++) {
        int p = scan.nextInt();
        int m = scan.nextInt();
        int x = ss[Math.min(p + m, 1000000)] - ss[Math.max(p - m, 1) - 1];
        c += x - 1;
      }

      System.out.println(c);
    }
  }
}
