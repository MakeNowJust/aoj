import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    while (scan.hasNext()) {
      double xa = scan.nextDouble();
      double ya = scan.nextDouble();
      double xb = scan.nextDouble();
      double yb = scan.nextDouble();
      double xc = scan.nextDouble();
      double yc = scan.nextDouble();
      double xd = scan.nextDouble();
      double yd = scan.nextDouble();

      if (0.0 < isIntersect(xa, ya, xc, yc, xb, yb, xd, yd) ||
          0.0 < isIntersect(xb, yb, xd, yd, xa, ya, xc, yc)) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }
    }
  }

  public static double isIntersect(double x1, double y1,
                                   double x2, double y2,
                                   double x3, double y3,
                                   double x4, double y4) {
    return ((x1 - x2) * (y3 - y1) + (y1 - y2) * (x1 - x3)) *
           ((x1 - x2) * (y4 - y1) + (y1 - y2) * (x1 - x4));
  }
}

