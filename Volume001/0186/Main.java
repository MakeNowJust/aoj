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
      long q1 = scan.nextLong();
      if (q1 == 0) break;
      long b = scan.nextLong();
      long c1 = scan.nextLong();
      long c2 = scan.nextLong();
      long q2 = scan.nextLong();

      long ans1 = 0;
      long min = 1;
      long max = q2;
      while (min <= max) {
        long mid = (min + max) / 2;
        if (mid * c1 > b) {
          max = mid - 1;
        } else if (mid + (b - mid * c1) / c2 < q1) {
          max = mid - 1;
        } else {
          ans1 = mid;
          min = mid + 1;
        }
      }
      if (ans1 == 0) {
        System.out.println("NA");
      } else {
        System.out.printf("%d %d\n", ans1, (b - ans1 * c1) / c2);
      }
    }
  }
}
