import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[][] BIG = {
    {0, -2},
    {-2, 0},
    {2, 0},
    {0, 2},
  };
  static int[][] MIDDLE = {
    {-1, -1},
    {1, -1},
    {-1, 1},
    {1, 1},
  };
  static int[][] SMALL = {
    {0, -1},
    {-1, 0},
    {1, 0},
    {0, 1},
    {0, 0}
  };
  static int[][][] DROPS = {SMALL, MIDDLE, BIG};

  public static void main(String[] args) {
    int[][] paper = new int[10][10];
    scan.useDelimiter("\\s*,\\s*|\\n");

    while (scan.hasNext()) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      int size = scan.nextInt() - 1;

      for (int i = size; i >= 0; i--) {
        for (int j = 0; j < DROPS[i].length; j++) {
          int nx = x + DROPS[i][j][0];
          int ny = y + DROPS[i][j][1];
          if (nx < 0 || 10 <= nx || ny < 0 || 10 <= ny) continue;
          paper[nx][ny] += 1;
        }
      }
    }

    int count = 0;
    int max = 0;
    for (int x = 0; x < 10; x++) {
      for (int y = 0; y < 10; y++) {
        if (paper[x][y] == 0) {
          count += 1;
        } else {
          max = Math.max(max, paper[x][y]);
        }
      }
    }
    System.out.println(count);
    System.out.println(max);
  }
}
