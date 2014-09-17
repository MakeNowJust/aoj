import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    boolean[][] d = new boolean[9][5];

    for (int i = 0; i < 9; i++) {
      String line = scan.next();
      for (int j = 0; j < line.length(); j++) {
        d[i][j] = line.charAt(j) == '1';
      }
    }

    int x = 0, y = 0;
    char s = 'R';
    boolean first = true;
    while (!(x == 0 && y == 0) || first) {
      first = false;
      switch (s) {
      case 'R':
        if (y != 0 && d[y * 2 - 1][x]) {
          s = 'U';
        } else if (!d[y * 2][x]) {
          if (y != 4 && d[y * 2 + 1][x]) {
            s = 'D';
          } else {
            s = 'L';
          }
        }
        break;
      case 'L':
        if (y != 4 && d[y * 2 + 1][x]) {
          s = 'D';
        } else if (x == 0 || !d[y * 2][x - 1]) {
          if (y != 0 && d[y * 2 - 1][x]) {
            s = 'U';
          } else {
            s = 'L';
          }
        }
        break;
      case 'D':
        if (d[y * 2][x]) {
          s = 'R';
        } else if (y == 4 || !d[y * 2 + 1][x]) {
          if (x != 0 && d[y * 2][x - 1]) {
            s = 'L';
          } else {
            s = 'U';
          }
        }
        break;
      case 'U':
        if (x != 0 && d[y * 2][x - 1]) {
          s = 'L';
        } else if (y == 0 || !d[y * 2 - 1][x]) {
          if (d[y * 2][x]) {
            s = 'R';
          } else {
            s = 'D';
          }
        }
        break;
      }
      switch (s) {
      case 'R': x += 1; break;
      case 'L': x -= 1; break;
      case 'D': y += 1; break;
      case 'U': y -= 1; break;
      }
      System.out.print(s);
    }
    System.out.println("");
  }
}
