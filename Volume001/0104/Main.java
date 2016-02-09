import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int h = scan.nextInt();
      int w = scan.nextInt();
      if (h == 0 && w == 0) break;

      char[][] ts = new char[h][];
      boolean[][] vs = new boolean[h][w];
      for (int i = 0; i < h; i++) {
        ts[i] = scan.next().toCharArray();
      }

      int x = 0;
      int y = 0;
      loop: for (;;) {
        if (vs[y][x]) {
          System.out.println("LOOP");
          break loop;
        }
        vs[y][x] = true;

        switch (ts[y][x]) {
        case '.':
          System.out.printf("%d %d\n", x, y);
          break loop;
        case '^':
          y -= 1;
          break;
        case 'v':
          y += 1;
          break;
        case '>':
          x += 1;
          break;
        case '<':
          x -= 1;
          break;
        }
      }
    }
  }
}
