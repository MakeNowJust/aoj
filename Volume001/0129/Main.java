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

      Point[] w = new Point[n];
      double[] r = new double[n];
      for (int i = 0; i < n; i++) {
        w[i] = new Point(scan.nextDouble(), scan.nextDouble());
        r[i] = scan.nextDouble();
      }

      int m = scan.nextInt();
      for (int i = 0; i < m; i++) {
        Point t = new Point(scan.nextDouble(), scan.nextDouble());
        Point s = new Point(scan.nextDouble(), scan.nextDouble());

        boolean safe = false;
        for (int j = 0; j < n; j++) {
          // 円の中心と直線の距離が円の半径より小さければ、円と直線は当たらない
          double w_ts = Math.abs((s.sub(t)).cross(w[j].sub(t))) / s.sub(t).abs();
          if (w_ts > r[j]) continue;
          double w_t = t.sub(w[j]).abs();
          double w_s = s.sub(w[j]).abs();

              // どちらかが円の中
          if (w_t > r[j] && w_s <= r[j] || w_t <= r[j] && w_s > r[j] ||
              // どちらも円の外だが、円を挟んでいる
              w_t > r[j] && w_s > r[j] && (s.sub(t)).dot(w[j].sub(t)) >= 0 && (t.sub(s)).dot(w[j].sub(s)) >= 0) {
            safe = true;
            break;
          }
        }

        System.out.println(safe ? "Safe" : "Danger");
      }
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
