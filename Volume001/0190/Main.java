import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[][] p = new int[][]{
    { -1, 0 },
    { 1, 0 },
    { 0, -1 },
    { 0, 1 },
  };
  static int[][] a = new int[][]{
    {-1, -1,  0, -1, -1},
    {-1,  1,  2,  3, -1},
    { 4,  5,  6,  7,  8},
    {-1,  9, 10, 11, -1},
    {-1, -1,  0, -1, -1},
  };
  public static void main(String... args) {
    int[][] data = new int[5][5];

    for (;;) {
      int x = scan.nextInt();
      if (x == -1) break;
      for (int i = 0; i < 5; i++) data[0][i] = i == 2 ? x : -1;
      for (int i = 1; i < 5; i++)
        for (int j = 0; j < 5; j++)
          data[i][j] = i == 2 || j == 2 || (i == 1 || i == 3) && (j == 1 || j == 3) ? scan.nextInt() : -1;

      int ans = -1;
      ArrayDeque<Data> queue = new ArrayDeque<Data>();
      HashSet<String> set = new HashSet<String>();
      queue.add(new Data(data, 0));

      while (!queue.isEmpty()) {
        Data current = queue.remove();
        int[][] d = current.data;
        int count = current.count;
        String s = Arrays.deepToString(d);
        if (set.contains(s)) continue;
        set.add(s);
        if (count > 20) continue;
        int dist = 0;
        for (int i1 = 0; i1 < 5; i1++)
          for (int j1 = 0; j1 < 5; j1++)
            if (d[i1][j1] > 0)
              for (int i2 = 0; i2 < 5; i2++)
                for (int j2 = 0; j2 < 5; j2++)
                  if (d[i1][j1] == a[i2][j2])
                    dist += Math.abs(i1 - i2) + Math.abs(j1 - j2);
        if (dist == 0) {
          ans = count;
          break;
        }
        if (dist + count > 20) continue;

        for (int i = 0; i < 5; i++)
          for (int j = 0; j < 5; j++)
            if (d[i][j] == 0)
              for (int k = 0; k < p.length; k++) {
                int ni = i + p[k][0];
                int nj = j + p[k][1];
                if (ni < 0 || nj < 0 || ni >= 5 || nj >= 5 || d[ni][nj] == -1)
                  continue;
                int tmp = d[i][j];
                d[i][j] = d[ni][nj];
                d[ni][nj] = tmp;
                queue.add(new Data(d, count + 1));
                d[ni][nj] = d[i][j];
                d[i][j] = tmp;
              }
      }

      if (ans == -1) {
        System.out.println("NA");
      } else {
        System.out.println(ans);
      }
    }
  }

  static class Data {
    int[][] data;
    int count;

    Data(int[][] data, int count) {
      this.data = Arrays.copyOf(data, data.length);
      for (int i = 0; i < 5; i++) this.data[i] = Arrays.copyOf(data[i], data[i].length);
      this.count = count;
    }
  }
}
