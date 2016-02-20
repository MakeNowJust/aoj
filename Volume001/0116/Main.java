import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int h = scan.nextInt();
      int w = scan.nextInt();
      if ((h | w) == 0) break;

      scan.nextLine();
      char[][] t = new char[h + 1][];
      for (int i = 1; i <= h; i++) {
        t[i] = scan.nextLine().toCharArray();
      }

      int[][] c = new int[h + 1][w];
      for (int i = 1; i <= h; i++) {
        for (int j = 0; j < w; j++) {
          c[i][j] = t[i][j] == '*' ? 0 : c[i - 1][j] + 1;
        }
      }

      int ans = 0;
      for (int i = 1; i <= h; i++) {
        int rh = 0;
        for (int j = 0; j < w; j++) {
          rh = c[i][j];
          // 左上(i, j)、右上(i, k)の長方形
          for (int k = j; k < w; k++) {
            rh = Math.min(rh, c[i][k]);
            ans = Math.max(ans, rh * (k - j + 1));
          }
        }
      }

      System.out.println(ans);
    }
  }
}
