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
    int d = scan.nextInt();
    for (int i = 0; i < d; i++) {
      if (i != 0) System.out.println();
      int n = scan.nextInt();
      char[][] s = spiral(n);
      for (int j = 0; j < n; j++) {
        System.out.println(new String(s[j]));
      }
    }
  }

  static int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
  static int[] dy = {-1, 0, 1, 0, 1, -1, 1, -1};

  static char[][] fix(char[][] s) {
    char[][] ss = new char[s.length - 4][s.length - 4];
    for (int i = 2; i < s.length - 2; i++) {
      for (int j = 2; j < s.length - 2; j++) {
        ss[i - 2][j - 2] = s[i][j];
      }
    }
    return ss;
  }

  static char[][] spiral(int n) {
    char[][] s = new char[n + 4][n + 4];
    for (int i = 0; i < n + 4; i++) {
      for (int j = 0; j < n + 4; j++) {
        s[i][j] = i == 0 || j == 0 || i == n + 3 || j == n + 3 ? '#' : ' ';
      }
    }

    int x = 2;
    int y = n + 2;
    int d = 0;
    loop:
    for (;;) {
      s[y][x] = '#';

      int nx = x + dx[d];
      int ny = y + dy[d];
      int nx2 = x + dx[d] * 2;
      int ny2 = y + dy[d] * 2;
      if (s[ny2][nx2] == '#') {
        int nd = (d + 1) % 4;

        nx = x + dx[nd];
        ny = y + dy[nd];
        for (int i = 0; i < 8; i++) {
          int nnx = nx + dx[i];
          int nny = ny + dy[i];
          if (nnx == x && nny == y || nnx == x - dx[d] && nny == y - dy[d]) continue;
          if (s[nny][nnx] == '#') return fix(s);
        }
        d = nd;
        x = nx;
        y = ny;
      } else {
        x = nx;
        y = ny;
      }
    }
  }
}
