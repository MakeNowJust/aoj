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
      int[][] cubes = new int[n][6];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < 6; j++) {
          switch (scan.next()) {
          case "Red": cubes[i][j] = 0; break;
          case "Yellow": cubes[i][j] = 1; break;
          case "Blue": cubes[i][j] = 2; break;
          case "Magenta": cubes[i][j] = 3; break;
          case "Green": cubes[i][j] = 4; break;
          case "Cyan": cubes[i][j] = 5; break;
          }
        }
      }
      int ans = 0;
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if (check(cubes[i], cubes[j])) {
            ans += 1;
            break;
          }
        }
      }
      System.out.println(ans);
    }
  }

  static int[][] r = new int[][]{{2, 4, 3, 1}, {2, 0, 3, 5}, {5, 4, 0, 1}, {0, 4, 5, 1}, {2, 5, 3, 0}, {3, 4, 2, 1}};

  static boolean check(int[] a, int[] b) {
    for (int i = 0; i < 6; i++)
      for (int j = 0; j < 6; j++)
        if (a[i] == b[j])
          for (int k = 0; k < 4; k++) {
            boolean f = true;
            for (int l = 0; l < 4; l++)
              if (a[r[i][l]] != b[r[j][(l + k) % 4]]) {
                f = false;
                break;
              }
            if (f) return true;
          }
    return false;
  }
}
