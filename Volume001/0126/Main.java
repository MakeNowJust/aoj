import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    boolean flag = false;
    for (int h = 0; h < n; h++) {
      int[][] b = new int[9][9];
      boolean[][] f = new boolean[9][9];
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          b[i][j] = scan.nextInt();
        }
      }

      if (flag) System.out.println();
      flag = true;

      for (int i = 0; i < 9; i++) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < 9; j++) {
          map.compute(b[i][j], (k, v) -> (v == null ? 0 : v) + 1);
        }
        for (int j = 0; j < 9; j++) {
          f[i][j] = f[i][j] || map.get(b[i][j]) >= 2;
        }
      }

      for (int j = 0; j < 9; j++) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
          map.compute(b[i][j], (k, v) -> (v == null ? 0 : v) + 1);
        }
        for (int i = 0; i < 9; i++) {
          f[i][j] = f[i][j] || map.get(b[i][j]) >= 2;
        }
      }

      for (int y = 0; y < 9; y += 3) {
        for (int x = 0; x < 9; x += 3) {
          HashMap<Integer, Integer> map = new HashMap<>();
          for (int i = y; i < y + 3; i++) {
            for (int j = x; j < x + 3; j++) {
              map.compute(b[i][j], (k, v) -> (v == null ? 0 : v) + 1);
            }
          }
          for (int i = y; i < y + 3; i++) {
            for (int j = x; j < x + 3; j++) {
              f[i][j] = f[i][j] || map.get(b[i][j]) >= 2;
            }
          }
        }
      }

      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          System.out.printf("%c%d", f[i][j] ? '*' : ' ', b[i][j]);
        }
        System.out.println();
      }
    }
  }
}
