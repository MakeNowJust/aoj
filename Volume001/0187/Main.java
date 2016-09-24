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
    Vec[] vs = new Vec[6];
    for (;;) {
      for (int i = 0; i < 2; i++) {
        vs[i] = new Vec(scan.nextDouble(), scan.nextDouble());
      }
      if (vs[0].x == 0 && vs[0].y == 0 && vs[1].x == 0 && vs[1].x == 0) break;
      for (int i = 2; i < 6; i++) {
        vs[i] = new Vec(scan.nextDouble(), scan.nextDouble());
      }

      String ans = null;
      Vec[] is = new Vec[3];
      for (int i = 0; i < 3; i++) {
        is[i] = intersection(vs[i * 2], vs[i * 2 + 1], vs[(i + 1) * 2 % 6], vs[(i + 1) * 2 % 6 + 1]);
        if (is[i] == null) {
          ans = "kyo";
          break;
        }
      }

      if (ans == null) {
        if (is[0].equals(is[1]) || is[1].equals(is[2]) || is[2].equals(is[0])) {
          ans = "kyo";
        } else {
          double s = area(is[0], is[1], is[2]);
          if        (s >= 1_900_000) {
            ans = "dai-kichi";
          } else if (s >= 1_000_000) {
            ans = "chu-kichi";
          } else if (s >=   100_000) {
            ans = "kichi";
          } else {
            ans = "syo-kichi";
          }
        }
      }
      System.out.println(ans);
    }
  }

  static Vec intersection(Vec p1, Vec p2, Vec q1, Vec q2) {
    double a = p2.sub(p1).cross(q1.sub(p1));
    double b = p1.sub(p2).cross(q2.sub(p2));
    double c = q2.sub(q1).cross(p1.sub(q1));
    double d = q1.sub(q2).cross(p2.sub(q2));
    if (a * b < 0 || c * d < 0) {
      return null;
    }
    return q1.add(q2.sub(q1).mul(a / (a + b)));
  }

  static double area(Vec a, Vec b, Vec c) {
    return Math.abs(b.sub(a).cross(c.sub(a))) / 2;
  }

  static class Vec {
    double x;
    double y;

    Vec(double x, double y) {
      this.x = x;
      this.y = y;
    }

    Vec add(Vec v) {
      return new Vec(x + v.x, y + v.y);
    }

    Vec sub(Vec v) {
      return new Vec(x - v.x, y - v.y);
    }

    Vec mul(double a) {
      return new Vec(x * a, y * a);
    }

    double cross(Vec v) {
      return x * v.y - y * v.x;
    }

    double abs() {
      return Math.abs(x * x + y * y);
    }

    boolean equals(Vec v) {
      return x == v.x && y == v.y;
    }
  }
}
