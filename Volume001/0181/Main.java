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
      int m = scan.nextInt();
      int n = scan.nextInt();
      if ((m | n) == 0) break;

      int[] w = new int[n];
      for (int i = 0; i < n; i++) {
        w[i] = scan.nextInt();
      }

      int min = 0;
      int max = 1500000;
      int ans = 0;
      while (min <= max) {
        int mid = (min + max) / 2;
        if (check(w, mid) <= m) {
          ans = mid;
          max = mid - 1;
        } else {
          min = mid + 1;
        }
      }

      System.out.println(ans);
    }
  }

  static int check(int[] w, int d) {
    int m = 1;
    int s = 0;

    for (int i = 0; i < w.length; i++) {
      if (w[i] > d) {
        return Integer.MAX_VALUE;
      }

      s += w[i];
      if (s > d) {
        m += 1;
        s = w[i];
      }
    }

    return m;
  }
}
