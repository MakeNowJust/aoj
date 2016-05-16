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
      LinkedList<Integer> b = new LinkedList<>();
      for (int i = 0; i < 5000; i++) b.add(0);
      int m = scan.nextInt();
      if (m == 0) break;

      int t = 0;

      for (int i = 0; i < m; i++) {
        int d = scan.nextInt();
        int p = scan.nextInt();
        int q = scan.nextInt() - 1;

        int n = -1;

        loop:
        for (int j = t; j >= 0; j--) {
          for (int k = 0; k < p; k++) {
            if (d == 1) {
              if ((b.get(j) & (1 << (q + k))) != 0) {
                n = j;
                break loop;
              }
            } else {
              if ((b.get(j + k) & (1 << q)) != 0) {
                n = j;
                break loop;
              }
            }
          }
        }
        
        n += 1;

        for (int k = 0; k < p; k++) {
          if (d == 1) {
            b.set(n, b.get(n) | (1 << (q + k)));
            t = Math.max(t, n + 1);
          } else {
            b.set(n + k, b.get(n + k) | (1 << q));
            t = Math.max(t, n + k + 1);
          }
        }

        Iterator<Integer> it = b.iterator();
        while (it.hasNext()) {
          int s = it.next();
          if (s == 0) {
            break;
          } else if (s == 0b11111) {
            it.remove();
            t -= 1;
          }
        }
      }

      int count = 0;
      for (int s : b) {
        count += Integer.bitCount(s);
      }
      System.out.println(count);
    }
  }
}
