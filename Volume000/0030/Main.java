import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int n = scan.nextInt();
      int s = scan.nextInt();
      if (n == 0 && s == 0) break;

      int ans = solve(n, s, 0);
      System.out.println(ans);
    }
  }

  public static int solve(int n, int s, int d) {
    if (n == 1) {
      if (d <= s && s <= 9) return 1;
      return 0;
    }
    if (s < 0) return 0;

    int ans = 0;
    for (int i = d; i <= 9; i++) {
      ans += solve(n - 1, s - i, i + 1);
    }

    return ans;
  }
}
