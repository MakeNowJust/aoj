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
      Point a = new Point(scan.nextDouble(), scan.nextDouble());
      if (a.x == 0 && a.y == 0) break;
      Point b = new Point(scan.nextDouble(), scan.nextDouble());
      Point c = new Point(scan.nextDouble(), scan.nextDouble());
      Point o = new Point(scan.nextDouble(), scan.nextDouble());
      double r = scan.nextDouble();

      Tri tri = new Tri(a, b, c);
      Circle circle = new Circle(o, r);

      char ans = circle.contains(tri);
      if (ans == 'd') ans = tri.contains(circle);
      System.out.println(ans);
    }
  }

  static class Point {
    public double x, y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public Point sub(Point a) {
      return new Point(x - a.x, y - a.y);
    }

    public double dot(Point a ) {
      return x * a.x + y * a.y;
    }

    public double cross(Point a) {
      return x * a.y - y * a.x;
    }

    public double abs2() {
      return x * x + y * y;
    }

    public double abs() {
      return Math.sqrt(abs2());
    }
  }

  static double distLP(Point l_a, Point l_b, Point p) {
    if (l_b.sub(l_a).dot(p.sub(l_a)) < 0) return p.sub(l_a).abs();
    if (l_a.sub(l_b).dot(p.sub(l_b)) < 0) return p.sub(l_b).abs();
    return Math.abs(l_b.sub(l_a).cross(p.sub(l_a))) / l_b.sub(l_a).abs();
  }

  static class Tri {
    public Point a, b, c;

    public Tri(Point a, Point b, Point c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public char contains(Circle circle) {
      double ab_o = a.sub(b).cross(circle.o.sub(b));
      double bc_o = b.sub(c).cross(circle.o.sub(c));
      double ca_o = c.sub(a).cross(circle.o.sub(a));

      double min = Math.min(distLP(a, b, circle.o), Math.min(distLP(b, c, circle.o), distLP(c, a, circle.o)));
      if (!(ab_o > 0 && bc_o > 0 && ca_o > 0) &&
          !(ab_o < 0 && bc_o < 0 && ca_o < 0)) {
        return min > circle.r ? 'd' : 'c';
      }

      return min >= circle.r ? 'a' : 'c';
    }
  }

  static class Circle {
    public Point o;
    public double r;

    public Circle(Point o, double r) {
      this.o = o;
      this.r = r;
    }

    public char contains(Tri tri) {
      double a_o = tri.a.sub(o).abs();
      double b_o = tri.b.sub(o).abs();
      double c_o = tri.c.sub(o).abs();

      return a_o <= r && b_o <= r && c_o <= r  ? 'b' : 'd';
    }
  }
}
