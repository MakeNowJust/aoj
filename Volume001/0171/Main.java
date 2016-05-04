import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static char[][] str = new char[8][];

  static boolean[] used = new boolean[8];
  static int[] now = new int[8];
  static int[] r1 = new int[8];
  static int[] r2 = new int[8];

  static int[][] r = {
    {0, 1, 2},
    {0, 2, 4},
    {0, 4, 3},
    {0, 3, 1},
    {5, 2, 1},
    {5, 4, 2},
    {5, 3, 4},
    {5, 1, 3},
  };

  public static void main(String... args) {
    for (;;) {
      str[0] = scan.next().toCharArray();
      if (str[0].length == 1) break;

      for (int i = 1; i < 8; i++) str[i] = scan.next().toCharArray();

      Arrays.fill(used, false);
      System.out.println(solve(0) ? "YES" : "NO");
    }
  }

  static boolean solve(int a) {
    if (a == 8) return true;

    for (int i = 0; i < 8; i++) {
      if (used[i]) continue;
      used[i] = true;
      now[a] = i;
      for (int j = 0; j < 8; j++) {
        for (int k = 0; k < 3; k++) {
          r1[a] = j;
          r2[a] = k;
          int cn = Integer.bitCount(a) % 2;
          if ((a & 1) > 0 && (str[i][r[j][(k + 1 + -(cn - 1)) % 3]] ^ 32) != str[now[a - 1]][r[r1[a - 1]][(r2[a - 1] + 1 + cn) % 3]]) continue;
          if ((a & 2) > 0 && (str[i][r[j][(k + 1 + cn) % 3]] ^ 32) != str[now[a - 2]][r[r1[a - 2]][(r2[a - 2] + 1 + -(cn - 1)) % 3]]) continue;
          if ((a & 4) > 0 && (str[i][r[j][k % 3]] ^ 32) != str[now[a - 4]][r[r1[a - 4]][r2[a - 4] % 3]]) continue;
          if (solve(a + 1)) return true;
        }
      }
      used[i] = false;
    }

    return false;
  }
}
