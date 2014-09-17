import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int a, b, c, d, e, f;

    while (scan.hasNext()) {
      a = scan.nextInt();
      b = scan.nextInt();
      c = scan.nextInt();
      d = scan.nextInt();
      e = scan.nextInt();
      f = scan.nextInt();

      // ax + by = c
      // dx + ey = f
      
      //    adx + bdy = cd
      // -) adx + aey = af
      int bd = b * d;
      int ae = a * e;
      int cd = c * d;
      int af = a * f;
      // (bd - ae)y = cd - af
      double y = (double)(cd - af) / (bd - ae);
      double x = (double)(c - b * y) / a;
      System.out.printf("%.3f %.3f\n", x, y);
    }
  }
}
