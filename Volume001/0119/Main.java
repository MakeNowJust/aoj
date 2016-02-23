import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int m = scan.nextInt();
    int n = scan.nextInt();
    boolean[][] a = new boolean[m + 1][m + 1];
    int[] c = new int[m + 1];
    for (int i = 0; i < n; i++) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      a[x][y] = true;
      c[y] += 1;
    }
    int r = m;
    while (r > 0) {
      for (int i = 1; i <= m; i++) {
        if (c[i] == 0) {
          r -= 1;
          c[i] -= 1;
          System.out.println(i);
          for (int j = 1; j <= m; j++) {
            if (a[i][j]) {
              c[j] -= 1;
            }
          }
        }
      }
    }
  }
}
