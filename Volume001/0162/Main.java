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
    boolean[] f = new boolean[1000_001];
    f[1] = true;
    for (int i = 0; i <= 1000_000; i++) {
      if (f[i]) {
        if (i * 2 <= 1000_000) f[i * 2] = true;
        if (i * 3 <= 1000_000) f[i * 3] = true;
        if (i * 5 <= 1000_000) f[i * 5] = true;
      }
    }

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;
      int m = scan.nextInt();

      int c = 0;
      for (int i = n; i <= m; i++) if (f[i]) c++;
      System.out.println(c);
    }
  }
}
