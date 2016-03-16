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
      char[][] in = new char[n][];
      for (int i = 0; i < n; i++) in[i] = scan.next().toCharArray();
      int[][] x = new int[n][n];
      int max = 0;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (in[i][j] == '0') continue;

          if ((x[i][j] & 1) == 0) {
            for (int k = 0; j + k < n; k++) {
              if (in[i][j + k] == '0') break;
              x[i][j + k] |= 1;
              max = Math.max(max, k + 1);
            }
          }

          if ((x[i][j] & 2) == 0) {
            for (int k = 0; i + k < n; k++) {
              if (in[i + k][j] == '0') break;
              x[i + k][j] |= 2;
              max = Math.max(max, k + 1);
            }
          }

          if ((x[i][j] & 4) == 0) {
            for (int k = 0; Math.max(i + k, j + k) < n; k++) {
              if (in[i + k][j + k] == '0') break;
              x[i + k][j + k] |= 4;
              max = Math.max(max, k + 1);
            }
          }

          if ((x[i][j] & 8) == 0) {
            for (int k = 0; i + k < n && j - k >= 0; k++) {
              if (in[i + k][j - k] == '0') break;
              x[i + k][j - k] |= 8;
              max = Math.max(max, k + 1);
            }
          }
        }
      }

      System.out.println(max);
    }
  }
}
