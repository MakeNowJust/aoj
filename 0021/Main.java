import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      Vec a = new Vec(scan.nextDouble(), scan.nextDouble());
      Vec b = new Vec(scan.nextDouble(), scan.nextDouble());
      Vec c = new Vec(scan.nextDouble(), scan.nextDouble());
      Vec d = new Vec(scan.nextDouble(), scan.nextDouble());

      Vec ab = b.sub(a);
      Vec cd = d.sub(c);

      System.out.println(Math.abs(ab.cross(cd)) <= 1e-10 ? "YES" : "NO");
    }
  }

  static class Vec {
    public double x;
    public double y;

    public Vec(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public Vec mul(double k) {
      return new Vec(k * this.x, k * this.y);
    }

    public Vec sub(Vec b) {
      Vec a = this;
      double x = a.x - b.x;
      double y = a.y - b.y;
      return new Vec(x, y);
    }

    // 外積
    public double cross(Vec b) {
      Vec a = this;
      return a.x * b.y - a.y * b.x;
    }
  }
}
