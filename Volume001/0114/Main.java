import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int a1  = scan.nextInt();
      int m1 = scan.nextInt();
      int a2  = scan.nextInt();
      int m2 = scan.nextInt();
      int a3  = scan.nextInt();
      int m3 = scan.nextInt();
      if ((a1 | m1 | a2 | m2 | a3 | m3) == 0) break;
      int i, j, k, x, y, z;
      for (i = 1, x = a1 % m1; x != 1; i++) x = x * a1 % m1;
      for (j = 1, y = a2 % m2; y != 1; j++) y = y * a2 % m2;
      for (k = 1, z = a3 % m3; z != 1; k++) z = z * a3 % m3;
      System.out.println(lcm(lcm(i, j), k));
    }
  }

  static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
  }

  static long gcd(long a, long b) {
    return b > 0 ? gcd(b, a % b) : a;
  }
}
