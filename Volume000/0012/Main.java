import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      double x1 = scan.nextDouble();
      double y1 = scan.nextDouble();
      double x2 = scan.nextDouble();
      double y2 = scan.nextDouble();
      double x3 = scan.nextDouble();
      double y3 = scan.nextDouble();
      double xp = scan.nextDouble();
      double yp = scan.nextDouble();

      Vec a = new Vec(x1, y1);
      Vec b = new Vec(x2, y2);
      Vec c = new Vec(x3, y3);
      Vec p = new Vec(xp, yp);

      Vec ab = b.sub(a);
      Vec bp = p.sub(b);

      Vec bc = c.sub(b);
      Vec cp = p.sub(c);

      Vec ca = a.sub(c);
      Vec ap = p.sub(a);

      double c1 = ab.x * bp.y - ab.y * bp.x;
      double c2 = bc.x * cp.y - bc.y * cp.x;
      double c3 = ca.x * ap.y - ca.y * ap.x;

      boolean flag = (c1 > 0 && c2 > 0 && c3 > 0) ||
                     (c1 < 0 && c2 < 0 && c3 < 0);
      System.out.println(flag ? "YES" : "NO");
    }
  }

  static class Vec {
    public double x;
    public double y;

    public Vec(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public Vec sub(Vec b) {
      Vec a = this;
      double x = a.x - b.x;
      double y = a.y - b.y;
      return new Vec(x, y);
    }
  }

}
