import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static final int[][] A = {
    {1, 1},
    {1, 1},
  };
  static final int[][] B = {
    {1},
    {1},
    {1},
    {1},
  };
  static final int[][] C = {
    {1, 1, 1, 1},
  };
  static final int[][] D = {
    {0, 1},
    {1, 1},
    {1, 0},
  };
  static final int[][] E = {
    {1, 1, 0},
    {0, 1, 1},
  };
  static final int[][] F = {
    {1, 0},
    {1, 1},
    {0, 1},
  };
  static final int[][] G = {
    {0, 1, 1},
    {1, 1, 0},
  };
  static final int[][][] PATTERNS = {A, B, C, D, E, F, G};
  static final String PAT2STR = "ABCDEFG";

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int[][] stage = new int[8][8];
      for (int y = 0; y < 8; y++) {
        String line = scan.next();
        for (int x = 0; x <8; x++) {
          stage[y][x] = line.charAt(x) == '0' ? 0 : 1;
        }
      }

      search1:
      for (int y = 0; y < 8; y++) {
        for (int x = 0; x < 8; x++) {
          for (int i = 0; i < PATTERNS.length; i++) {
            boolean flag = true;
            search2:
            for (int py = 0; py < PATTERNS[i].length; py++) {
              for (int px = 0; px < PATTERNS[i][py].length; px++) {
                if (y + py >= 8 || x + px >= 8 || PATTERNS[i][py][px] != stage[y + py][x + px]) {
                  flag = false;
                  break search2;
                }
              }
            }
            if (flag) {
              System.out.println(PAT2STR.charAt(i));
              break search1;
            }
          }
        }
      }
    }
  }
}
