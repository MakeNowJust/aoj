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
      int[] xs = new int[n];
      for (int i = 0; i < n; i++) {
        xs[i] = scan.nextInt();
      }
      int t = scan.nextInt();

      int ans = 0;
      int min = 0;
      int max = n - 1;
      while (min <= max) {
        int mid = (min + max) / 2;
        int x = xs[mid];
        ans += 1;
        if (t == x) break;
        if (t < x) max = mid - 1;
        else       min = mid + 1;
      }
      System.out.println(ans);
    }
  }
}
