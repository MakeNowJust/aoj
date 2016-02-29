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
    int n = scan.nextInt();
    for (int h = 0; h < n; h++) {
      int[] b = new int[10];
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          b[i] |= scan.nextInt() << j;
        }
      }

      int[][] r = null;
      solve:
      for (int s = 0; s <= (1 << 10) - 1; s++) {
        int[] c = new int[10];
        for (int i = 0; i < 10; i++) c[i] = b[i];
        r = new int[10][10];
        for (int j = 0; j < 10; j++) {
          if ((s & (1 << j)) != 0) {
            flip(c, j, 0);
            r[0][j] = 1;
          }
        }
        for (int i = 1; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
            if ((c[i - 1] & (1 << j)) != 0) {
              flip(c, j, i);
              r[i][j] = 1;
            }
          }
        }
        for (int i = 0; i < 10; i++) {
          if (c[i] != 0) continue solve;
        }
        break;
      }

      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          System.out.printf("%d%s", r[i][j], j == 9 ? "\n" : " ");
        }
      }
    }
  }

  static int[] xs = {0, -1, 1,  0, 0};
  static int[] ys = {0,  0, 0, -1, 1};
  static void flip(int[] b, int x, int y) {
    for (int i = 0; i < xs.length; i++) {
      int nx = x + xs[i];
      int ny = y + ys[i];
      if (nx < 0 || 10 <= nx) continue;
      if (ny < 0 || 10 <= ny) continue;
      b[ny] ^= 1 << nx;
    }
  }
}
