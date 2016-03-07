import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static double EPS = 10e-6;

  public static void main(String... args) {
    int n = scan.nextInt();
    for (int h = 0; h < n; h++) {
      Point[] p = {
        new Point(scan.nextDouble(), scan.nextDouble()),
        new Point(scan.nextDouble(), scan.nextDouble()),
        new Point(scan.nextDouble(), scan.nextDouble()),
      };
      Point[] ks = {
        new Point(scan.nextDouble(), scan.nextDouble()),
        new Point(scan.nextDouble(), scan.nextDouble()),
      };

      int[] in = new int[2];
      for (int i = 0; i < 2; i++) {
        Point t = ks[i];
        double[] c = new double[3];
        for (int j = 0; j < 3; j++) {
          c[j] = (t.sub(p[j])).cross(p[j].sub(p[(j + 1) % 3]));
        }
        if (c[0] < -EPS && c[1] < -EPS && c[2] < -EPS || c[0] > EPS && c[1] > EPS && c[2] > EPS) {
          in[i] = 1;
        }
      }
      System.out.println((in[0] ^ in[1]) > 0 ? "OK" : "NG");
    }
  }

  static class Point {
    public double x, y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public Point sub(Point p) {
      return new Point(x - p.x, y - p.y);
    }

    public double dot(Point p) {
      return x * p.x + y * p.y;
    }

    public double cross(Point p) {
      return x * p.y - y * p.x;
    }

    public double abs() {
      return Math.sqrt(x * x + y * y);
    }
  }
}
