import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    while (scan.hasNext()) {
      int n = scan.nextInt();
      if (n == 0) break;

      int[][] a = new int[n][n];
      int x = n / 2;
      int y = n / 2 + 1;
      a[x][y] = 1;
      for (int i = 2; i <= n*n; i++) {
        x = x + 1;
        if (x >= n) x -= n;
        y = y + 1;
        if (y >= n) y -= n;
        if (a[x][y] == 0) {
          a[x][y] = i;
        } else {
          x = x - 1;
          if (x < 0) x += n;
          y = y + 1;
          if (y >= n) y -= n;
          a[x][y] = i;
        }
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.printf("%4d", a[j][i]);
        }
        System.out.println();
      }
    }
  }
}
