import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      ArrayList<Pair> ps = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        int c = scan.nextInt();
        int t = scan.nextInt() * 60 + scan.nextInt()
              + scan.nextInt() * 60 + scan.nextInt()
              + scan.nextInt() * 60 + scan.nextInt()
              + scan.nextInt() * 60 + scan.nextInt();
        ps.add(new Pair(c, t));
      }

      ps.sort(Comparator.comparing(Pair::getY));
      System.out.println(ps.get(0).x);
      System.out.println(ps.get(1).x);
      System.out.println(ps.get(ps.size() - 2).x);
    }
  }

  static class Pair {
    int x, y;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    int getY() { return y; }
  }
}
