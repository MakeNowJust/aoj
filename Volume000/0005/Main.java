import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      long a = scan.nextLong();
      long b = scan.nextLong();

      long g = gcd(a, b);
      System.out.printf("%d %d\n", g, a * b / g);
    }
  }

  // 最大公約数を求める
  public static long gcd(long a, long b) {
    long c;
    if (a < b) {
      c = a;
      a = b;
      b = c;
    }

    while (b != 0) {
      c = b;
      b = a % b;
      a = c;
    }

    return a;
  }
}
