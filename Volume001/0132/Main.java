import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static Puzzle z;
  static Piece[] ps, ts;

  public static void main(String... args) {
    for (;;) {
      {
        int h = scan.nextInt();
        int w = scan.nextInt();
        if ((h | w) == 0) break;

        char[][] p = new char[h][];
        int size = 0;
        for (int i = 0; i < h; i++) {
          p[i] = scan.next().toCharArray();
          for (int j = 0; j < w; j++) if (p[i][j] == '.') size++;
        }
        z = new Puzzle(h, w, p, size);
      }

      int n = scan.nextInt();
      ps = new Piece[n];
      for (int k = 0; k < n; k++) {
        int h = scan.nextInt();
        int w = scan.nextInt();
        char[][] p = new char[h][];
        int size = 0;
        for (int i = 0; i < h; i++) {
          p[i] = scan.next().toCharArray();
          for (int j = 0; j < w; j++) if (p[i][j] == '#') size++;
        }
        ps[k] = new Piece(h, w, p, size);
      }

      int p = scan.nextInt();
      for (int h = 0; h < p; h++) {
        int k = scan.nextInt();
        ts = new Piece[k];
        int sizeSum = 0;
        for (int i = 0; i < k; i++) {
          ts[i] = ps[scan.nextInt() - 1];
          sizeSum += ts[i].size;
        }
        if (sizeSum != z.size) {
          System.out.println("NO");
          continue;
        }
        Arrays.sort(ts, Comparator.comparing(Piece::getSize).reversed());
        System.out.println(solve(0) ? "YES" : "NO");
      }
    }
  }

  static boolean solve(int c) {
    if (c == ts.length) return true;

    Piece p;
    boolean[][] check = new boolean[z.h][z.w];
    for (int i = 0; i < z.h; i++) {
      for (int j = 0; j < z.w; j++) {
        if (z.p[i][j] == '#' || check[i][j]) continue;
        for (int k = c; k < ts.length; k++) {
          p = ts[k];
          for (int t = 0; t < 4; t++, p = p.rotate()) {
            for (int y = Math.max(0, i - p.h + 1); y <= i && y + p.h <= z.h; y++) {
              for (int x = Math.max(0, j - p.w + 1); x <= j && x + p.w <= z.w; x++) {
                boolean ok = true;
                okLoop:
                for (int a = 0; a < p.h; a++) {
                  for (int b = 0; b < p.w; b++) {
                    if (p.p[a][b] == '#' && z.p[y + a][x + b] == '#') {
                      ok = false;
                      break okLoop;
                    }
                  }
                }

                if (!ok) continue;

                for (int a = 0; a < p.h; a++) {
                  for (int b = 0; b < p.w; b++) {
                    if (p.p[a][b] == '#') check[y + a][x + b] = true;
                  }
                }
              }
            }
          }
        }
        if (!check[i][j]) return false;
      }
    }

    p = ts[c];
    for (int t = 0; t < 4; t++, p = p.rotate()) {
      for (int y = 0; y + p.h <= z.h; y++) {
        for (int x = 0; x + p.w <= z.w; x++) {
          boolean ok = true;
          okLoop:
          for (int a = 0; a < p.h; a++) {
            for (int b = 0; b < p.w; b++) {
              if (p.p[a][b] == '#' && z.p[y + a][x + b] == '#') {
                ok = false;
                break okLoop;
              }
            }
          }

          if (!ok) continue;

          for (int a = 0; a < p.h; a++) {
            for (int b = 0; b < p.w; b++) {
              if (p.p[a][b] == '#') z.p[y + a][x + b] = '#';
            }
          }

          boolean result = solve(c + 1);

          for (int a = 0; a < p.h; a++) {
            for (int b = 0; b < p.w; b++) {
              if (p.p[a][b] == '#') z.p[y + a][x + b] = '.';
            }
          }

          if (result) return true;
        }
      }
    }

    return false;
  }

  static class Puzzle {
    public int h, w;
    public char[][] p;
    public int size;

    public Puzzle(int h, int w, char[][] p, int size) {
      this.w = w;
      this.h = h;
      this.p = p;
      this.size = size;
    }

    public int getSize() {
      return size;
    }

    @Override
    public String toString() {
      return String.format("Puzzle(%d, %d, %s, %s)", w, h, Arrays.deepToString(p), size);
    }
  }

  static class Piece extends Puzzle {
    Piece rotated = null;

    public Piece(int h, int w, char[][] p, int size) {
      super(h, w, p, size);
    }

    public Piece rotate() {
      if (rotated != null) return rotated;

      int nh = w;
      int nw = h;
      char[][] np = new char[nh][nw];
      for (int i = 0; i < nh; i++) {
        for (int j = 0; j < nw; j++) {
          np[i][j] = p[j][nh - i - 1];
        }
      }
      return rotated = new Piece(nh, nw, np, size);
    }

    @Override
    public String toString() {
      return String.format("Piece(%d, %d, %s, %s)", w, h, Arrays.deepToString(p), size);
    }
  }
}
