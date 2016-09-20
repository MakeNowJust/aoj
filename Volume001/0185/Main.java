import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static boolean[] ps = new boolean[1000000];
  static {
    for (int i = 0; i < 1000000; i++) ps[i] = true;
    ps[0] = ps[1] = false;
    for (int i = 4; i < 1000000; i += 2) ps[i] = false;
    for (int i = 3; i < 1000000; i += 2) {
      if (ps[i]) {
        for (int j = i * 2; j < 1000000; j += i) ps[j] = false;
      }
    }
  }

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      int ans = 0;
      if (n - 2 == 2) ans += 1;
      for (int i = 3; i <= n / 2; i += 2) {
        if (ps[i] && ps[n - i]) ans += 1;
      }
      System.out.println(ans);
    }
  }
}
