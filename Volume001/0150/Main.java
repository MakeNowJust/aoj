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
    int ti = 0;
    int[] twin = new int[10001];
    boolean[] p = new boolean[10001];
    for (int i = 1; i <= 10000; i += 2) p[i] = true;
    p[1] = false; p[2] = true;
    for (int i = 3; i <= 10000; i += 2) {
      if (p[i]) {
        if (p[i - 2]) twin[ti++] = i;
        for (int j = i * 2; j <= 10000; j += i) p[j] = false;
      }
    }

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;
      int ans = 0;
      for (int i = 0; i < ti; i++) {
        if (twin[i] > n) break;
        ans = twin[i];
      }
      System.out.printf("%d %d\n", ans - 2, ans);
    }
  }
}
