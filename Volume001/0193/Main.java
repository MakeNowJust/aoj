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
      int s = scan.nextInt();
      int[] xs = new int[s];
      int[] ys = new int[s];
      for (int i = 0; i < s; i++) {
        xs[i] = scan.nextInt();
        ys[i] = scan.nextInt();
        xs[i] = xs[i] * 2 - ys[i] % 2;
      }
      int t = scan.nextInt();
      int[] ps = new int[t];
      int[] qs = new int[t];
      for (int i = 0; i < t; i++) {
        ps[i] = scan.nextInt();
        qs[i] = scan.nextInt();
        ps[i] = ps[i] * 2 - qs[i] % 2;
      }

      int[][] map = new int[n + 1][(m + 1) * 2];
      for (int y = 1; y <= n; y++)
        for (int x = y % 2 == 1 ? 1 : 2; x <= m * 2; x += 2) {
          int min = Integer.MAX_VALUE;
          for (int i = 0; i < s; i++) min = Math.min(min, dist(x, y, xs[i], ys[i]));
          map[y][x] = min;
        }

      int ans = 0;
      for (int i = 0; i < t; i++) {
        int cnt = 0;
        for (int y = 1; y <= n; y++)
          for (int x = y % 2 == 1 ? 1 : 2; x <= m * 2; x += 2)
            if (map[y][x] > dist(x, y, ps[i], qs[i])) cnt += 1;
        ans = Math.max(ans, cnt);
      }
      System.out.println(ans);
    }
  }

  static int dist(int x1, int y1, int x2, int y2) {
    int dx = Math.abs(x2 - x1);
    int dy = Math.abs(y2 - y1);
    return dx < dy ? dy : (dx + dy) / 2;
  }
}
