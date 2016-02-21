import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    int n = scan.nextInt();
    int m = scan.nextInt();

    int[][] p = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        p[i][j] = 1000*20+1;
      }
    }
    for (int i = 0; i < m; i++) {
      int a = scan.nextInt() - 1;
      int b = scan.nextInt() - 1;
      int c = scan.nextInt();
      int d = scan.nextInt();
      p[a][b] = c;
      p[b][a] = d;
    }

    int x1 = scan.nextInt() - 1;
    int x2 = scan.nextInt() - 1;
    int y1 = scan.nextInt();
    int y2 = scan.nextInt();

    for (int k = 0; k < n; k++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          p[i][j] = Math.min(p[i][j], p[i][k] + p[k][j]);
        }
      }
    }

    System.out.println(y1 - y2 - p[x1][x2] - p[x2][x1]);
  }
}
