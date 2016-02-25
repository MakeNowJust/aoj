import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[] xs = {-1,  0,  1,  2,  2,  2,  1,  0, -1, -2, -2, -2};
  static int[] ys = {-2, -2, -2, -1,  0,  1,  2,  2,  2,  1,  0, -1};

  public static void main(String[] args) {
    for (;;) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      if ((x | y) == 0) break;

      int n = scan.nextInt();
      int[][] s = new int[n][2];
      for (int i = 0; i < n; i++) {
        s[i][0] = scan.nextInt();
        s[i][1] = scan.nextInt();
      }

      System.out.println(dfs(n, s, x, y, 0) ? "OK" : "NA");
    }
  }

  static boolean dfs(int n, int[][] s, int x, int y, int i) {
    if (i == n) return true;

    for (int j = 0; j < xs.length; j++) {
      int nx = x + xs[j];
      int ny = y + ys[j];
      if (nx < 0 || 10 <= nx) continue;
      if (ny < 0 || 10 <= ny) continue;
      int dx = Math.abs(s[i][0] - nx);
      int dy = Math.abs(s[i][1] - ny);
      if (dx <= 1 && dy <= 1 && dx + dy != 0) {
        if (dfs(n, s, nx, ny, i + 1)) return true;
      }
    }

    return false;
  }
}
