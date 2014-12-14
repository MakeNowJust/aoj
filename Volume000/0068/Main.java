import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");
    while (scan.hasNext()) {
      int n = scan.nextInt();
      if (n == 0) break;
      ArrayList<Point> points = new ArrayList<Point>();
      for (int i = 0; i < n; i++) {
        points.add(new Point(scan.nextDouble(), scan.nextDouble()));
      }

      List<Point> result = convexHull(points);
      System.out.println(n - result.size());
    }
  }

  static List<Point> convexHull(ArrayList<Point> points) {
    Collections.sort(points);
    int k = 0;
    ArrayList<Point> result = new ArrayList<Point>();
    for (Point p : points) {
      while (k > 1 && result.get(k - 1).sub(result.get(k - 2)).cross(p.sub(result.get(k - 1))) <= 0) k--;
      if (k++ >= result.size()) result.add(p);
      else result.set(k-1, p);
    }
    Collections.reverse(points);
    int c = 0;
    int t = k;
    for (Point p : points) {
      if (c++ < 1) continue; // 最初の1つはスキップ（上の処理の時点で確実に含まれているから）
      while (k > t && result.get(k - 1).sub(result.get(k - 2)).cross(p.sub(result.get(k - 1))) <= 0) k--;
      if (k++ >= result.size()) result.add(p);
      else result.set(k-1, p);
    }
    return result.subList(0, k - 1);
  }

  static class Point implements Comparable<Point> {
    public final double x;
    public final double y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public int compareTo(Point that) {
      if (this.x != that.x) return this.x > that.x ? 1 : -1;
      return this.y == that.y ? 0 : this.y > that.x ? 1 : -1;
    }

    // |p||q|sin theta
    public double cross(Point q) {
      return (x * q.y) - (y * q.x);
    }

    public Point sub(Point q) {
      return new Point(x - q.x, y - q.y);
    }
  }
}
