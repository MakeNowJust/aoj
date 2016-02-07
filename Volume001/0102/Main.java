import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      int[][] a = new int[n + 1][n + 1];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          a[i][n] += a[i][j] = scan.nextInt();
        }
        a[n][n] += a[i][n];
      }
      for (int j = 0; j < n; j++) {
        for (int i = 0; i < n; i++) {
          a[n][j] += a[i][j];
        }
      }

      for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= n; j++) {
          System.out.printf("%5d", a[i][j]);
        }
        System.out.println();
      }
    }
  }
}
