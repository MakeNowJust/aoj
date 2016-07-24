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
      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = scan.nextInt();
      }

      Arrays.sort(a);
      boolean[] t = new boolean[n];
      t[0] = true;
      System.out.println(dfs(1, a[n - 1] - a[0], n, a, t) ? "YES" : "NO");
    }
  }

  static boolean dfs(int k, int rest, int n, int[] a, boolean[] t) {
    if (rest == 0) return greedy(n, a, Arrays.copyOf(t, n));
    if (rest < a[k]) return false;
    t[k] = true;
    if (dfs(k + 1, rest - a[k], n, a, t)) return true;
    t[k] = false;
    return dfs(k + 1, rest, n, a, t);
  }

  static boolean greedy(int n, int[] a, boolean[] t) {
    for (int i = 0; i < n; i++) {
      if (t[i]) continue;
      if (!choice(i - 1, a[i], n, a, t)) return false;
      t[i] = true;
    }
    return true;
  }

  static boolean choice(int k, int rest, int n, int[] a, boolean[] t) {
    if (rest == 0) return true;
    if (k < 0) return false;
    if (!t[k]) return choice(k - 1, rest, n, a, t);
    if (a[k] <= rest) {
      t[k] = false;
      if (choice(k - 1, rest - a[k], n, a, t)) return true;
      t[k] = true;
    }
    return choice(k - 1, rest, n, a, t);
  }
}
