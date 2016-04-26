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
      int r = 32;
      int[] j = new int[n];
      for (int i = 0; i < n; i++) j[i] = scan.nextInt();

      int k = 0;
      while (r > 0) {
        r -= (r - 1) % 5;
        System.out.println(r);
        r -= Math.min(j[k++ % n], r);
        System.out.println(r);
      }
    }
  }
}
