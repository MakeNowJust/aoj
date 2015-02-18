import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    char[][] map = new char[8][];

    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 8; j++) {
        map[j] = scan.next().toCharArray();
      }
      int x = scan.nextInt() - 1;
      int y = scan.nextInt() - 1;

      bomb(map, x, y);
      System.out.printf("Data %d:\n", i + 1);
      for (int j = 0; j < 8; j++) {
        System.out.println(new String(map[j]));
      }
    }
  }

  static void bomb(char[][] map, int x, int y) {
    map[y][x] = '0';
    for (int i = Math.max(x-3, 0); i < Math.min(x+4, 8); i++) {
      if (map[y][i] == '1') {
        bomb(map, i, y);
      }
    }
    for (int i = Math.max(y-3, 0); i < Math.min(y+4, 8); i++) {
      if (map[i][x] == '1') {
        bomb(map, x, i);
      }
    }
  }
}
