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

      int[] x = new int[n];
      for (int i = 0; i < n; i++) x[i] = scan.nextInt();

      int s = 0;
      for (int l = n; l >= 0; l--) {
        for (int i = 0; i + 1 < l; i++) {
          if (x[i] > x[i + 1]) {
            s += 1;
            x[i] ^= x[i + 1];
            x[i + 1] ^= x[i];
            x[i] ^= x[i + 1];
          }
        }
      }
      System.out.println(s);
    }
  }
}
