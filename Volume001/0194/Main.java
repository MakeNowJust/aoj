import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[][] ps = new int[][]{
    {  0,  1}, // south
    {  1,  0}, // east
    {  0, -1}, // north
    { -1,  0}, // west
  };

  public static void main(String... args) {
    for (;;) {
      int M = scan.nextInt();
      int N = scan.nextInt();
      if ((M | N) == 0) break;
      int D = scan.nextInt();
      int ns = scan.nextInt();
      int[][] s = new int[M][N];
      for (int i = 0; i < ns; i++) {
        int[] a = nextCoord();
        s[a[0]][a[1]] = scan.nextInt();
      }
      int nc = scan.nextInt();
      boolean[][][][] c = new boolean[M][N][M][N];
      for (int i = 0; i < nc; i++) {
        int[] a = nextCoord();
        int[] b = nextCoord();
        c[a[0]][a[1]][b[0]][b[1]] = c[b[0]][b[1]][a[0]][a[1]] = true;
      }
      int nj = scan.nextInt();
      int[][][][] j = new int[M][N][M][N];
      for (int i = 0; i < nj; i++) {
        int[] a = nextCoord();
        int[] b = nextCoord();
        j[a[0]][a[1]][b[0]][b[1]] = j[b[0]][b[1]][a[0]][a[1]] = scan.nextInt();
      }
      int[] e = nextCoord();
      int[] g = nextCoord();
      boolean[][][][] closed = new boolean[M][N][101][4];
      PriorityQueue<State> queue = new PriorityQueue<>(Comparator.comparing(State::getTime));
      queue.add(new State(e[1], e[0], 0, 1));
      int ans = Integer.MAX_VALUE;
      while (!queue.isEmpty()) {
        State o = queue.remove();
        if (closed[o.y][o.x][o.t][o.d]) continue;
        closed[o.y][o.x][o.t][o.d] = true;
        if (o.x == g[1] && o.y == g[0]) ans = Math.min(ans, o.t);
        for (int i = 0; i < 4; i++) {
          int[] p = ps[i];
          int nx = o.x + p[0];
          int ny = o.y + p[1];
          if (nx < 0 || N <= nx || ny < 0 || M <= ny || c[o.y][o.x][ny][nx]) continue;
          int nt = o.t + D + j[o.y][o.x][ny][nx];
          if (nt > 100 || s[ny][nx] != 0 && (nt / s[ny][nx]) % 2 != i % 2) continue;
          queue.add(new State(nx, ny, nt, i));
        }
      }
      System.out.println(ans);
    }
  }

  static int[] nextCoord() {
    String[] n = scan.next().split("-");
    return new int[]{(int)n[0].charAt(0) - 'a', Integer.parseInt(n[1], 10) - 1};
  }

  static class State {
    int x, y, t, d;
    State(int x, int y, int t, int d) {
      this.x = x;
      this.y = y;
      this.t = t;
      this.d = d;
    }

    int getTime() {
      return this.t;
    }
  }
}
