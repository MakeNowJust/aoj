import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int[][] a = new int[n + 1][n + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        a[i][j] = scan.nextInt() + a[i - 1][j] + a[i][j - 1] - a[i - 1][j - 1];
      }
    }

    int ans = Integer.MIN_VALUE;
    for (int y = 1; y <= n; y++) {
      for (int x = 1; x <= n; x++) {
        for (int i = y; i <= n; i++) {
          for (int j = x; j <= n; j++) {
            ans = Math.max(ans, a[i][j] - a[y - 1][j] - a[i][x - 1] + a[y - 1][x - 1]);
          }
        }
      }
    }

    System.out.println(ans);
  }
}
