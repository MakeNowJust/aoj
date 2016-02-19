import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static double EPS = 1e-10;

  public static void main(String[] args) {
    Vec3 p = new Vec3(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
    Vec3 q = new Vec3(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
    Vec3 a = new Vec3(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
    Vec3 b = new Vec3(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());
    Vec3 c = new Vec3(scan.nextDouble(), scan.nextDouble(), scan.nextDouble());

    Plane pl = new Plane(a, b, c);
    Vec3 x = pl.intersect(p, q);
    if (x == null) {
      System.out.println("HIT");
      return;
    }

    Tri tri = new Tri(a, b, c);
    System.out.println(tri.contains(x) ? "MISS" : "HIT");
  }

  static class Tri {
    public Vec3 a, b, c;

    public Tri(Vec3 a, Vec3 b, Vec3 c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public boolean contains(Vec3 p) {
      Vec3 ab = b.sub(a);
      Vec3 bc = c.sub(b);
      Vec3 ca = a.sub(c);

      Vec3 ap = p.sub(a);
      Vec3 bp = p.sub(b);
      Vec3 cp = p.sub(c);

      Vec3 x1 = ab.cross(bp);
      Vec3 x2 = bc.cross(cp);
      Vec3 x3 = ca.cross(ap);

      double dot12 = x1.dot(x2);
      double dot13 = x1.dot(x3);

      return dot12 > -EPS && dot13 > -EPS;
    }
  }

  static class Plane {
    public Vec3 v;
    public double d;

    public Plane(Vec3 a, Vec3 b, Vec3 c) {
      Vec3 ab = b.sub(a);
      Vec3 ac = c.sub(a);
      this.v = ab.cross(ac);
      this.d = this.v.dot(a);
    }

    public Vec3 intersect(Vec3 a, Vec3 b) {
      Vec3 ab = b.sub(a);
      double dot = v.dot(ab);
      if (Math.abs(dot) < EPS) {
        return null;
      }

      double r = (d - v.dot(a)) / dot;
      if (r < -EPS || 1 + EPS < r) {
        return null;
      }

      return a.add(ab.mul(r));
    }
  }

  static class Vec3 {
    public double x, y, z;

    public Vec3(double x, double y, double z) {
      this.x = x;
      this.y = y;
      this.z = z;
    }

    public Vec3 add(Vec3 v) {
      return new Vec3(x + v.x, y + v.y, z + v.z);
    }

    public Vec3 sub(Vec3 v) {
      return new Vec3(x - v.x, y - v.y, z - v.z);
    }

    public Vec3 mul(double a) {
      return new Vec3(x * a, y * a, z * a);
    }

    public Vec3 div(double a) {
      return new Vec3(x / a, y / a, z / a);
    }

    public double dot(Vec3 v) {
      return x * v.x + y * v.y + z * v.z;
    }

    public Vec3 cross(Vec3 v) {
      return new Vec3(
        y * v.z - z * v.y,
        z * v.x - x * v.z,
        x * v.y - y * v.x);
    }

    public double norm() {
      return x * x + y * y + z * z;
    }

    public double abs() {
      return Math.abs(norm());
    }
  }
}
