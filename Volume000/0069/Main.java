import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    solve: while (scan.hasNext()) {
      int n = scan.nextInt();
      if (n == 0) break;
      int m = scan.nextInt();
      int goal = scan.nextInt();
      int d = scan.nextInt();
      char[][] lines = new char[d][];
      for (int i = 0; i < d; i++) {
        lines[i] = scan.next().toCharArray();
      }
      if (check(lines, m - 1, goal - 1, n)) {
        System.out.println(0);
        continue solve;
      }
      for (int i = 0; i < d; i++) {
        for (int j = 0; j < n - 1; j++) {
          if (lines[i][j] == '1') continue;
          if (j + 1 < n - 1 && lines[i][j + 1] == '1') continue;
          if (j - 1 >= 0 && lines[i][j - 1] == '1') continue;
          lines[i][j] = '1';
          if (check(lines, m - 1, goal - 1, n)) {
            System.out.println((i + 1) + " " + (j + 1));
            continue solve;
          }
          lines[i][j] = '0';
        }
      }
      System.out.println(1);
    }
  }

  static boolean check(char[][] lines, int x, int goal, int n) {
    for (int i = 0; i < lines.length; i++) {
      if (x < n - 1 && lines[i][x] == '1') x++;
      else if (x - 1 >= 0 && lines[i][x - 1] == '1') x--;
    }
    return x == goal;
  }
}
