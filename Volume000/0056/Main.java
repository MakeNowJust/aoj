import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static boolean[] p = new boolean[50001];

  public static void main(String[] args) {
    p[0] = p[1] = true;
    for (int i = 4; i <= 50000; i += 2)
      p[i] = true;
    for (int i = 3; i <= 50000; i += 2)
      if (!p[i])
        for (int j = i * 2; j <= 50000; j += i)
          p[j] = true;

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      int ans = 0;
      if (!p[n - 2]) {
        ans += 1;
      }
      for (int i = 3; i * 2 <= n; i += 2) {
        if (!p[i] && !p[n - i]) {
          ans += 1;
        }
      }

      System.out.println(ans);
    }
  }
}
