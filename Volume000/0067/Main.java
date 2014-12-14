import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      char[][] map = new char[12][];
      for (int i = 0; i < 12; i++) {
        map[i] = scan.next().toCharArray();
      }

      int ans = 0;
      for (int i = 0; i < 12; i++) {
        for (int j = 0; j < 12; j++) {
          if (map[i][j] == '1') {
            ans += 1;
            check(map, i, j);
          }
        }
      }
      System.out.println(ans);
    }
  }

  static void check(char[][] map, int i, int j) {
    if (0 <= i && i < 12 && 0 <= j && j < 12 && map[i][j] == '1') {
      map[i][j] = '2';
      check(map, i, j + 1);
      check(map, i, j - 1);
      check(map, i + 1, j);
      check(map, i - 1, j);
    }
  }
}
