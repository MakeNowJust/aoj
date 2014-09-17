import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      double ax = scan.nextDouble();
      double ay = scan.nextDouble();
      double bx = scan.nextDouble();
      double by = scan.nextDouble();
      double cx = scan.nextDouble();
      double cy = scan.nextDouble();

      double a1 = 2 * (bx - ax);
      double b1 = 2 * (by - ay);
      double c1 = ax * ax - bx * bx + ay * ay - by * by;
      double a2 = 2 * (cx - ax);
      double b2 = 2 * (cy - ay);
      double c2 = ax * ax - cx * cx + ay * ay - cy * cy;

      double px = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
      double py = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);

      double r = Math.sqrt((px - ax) * (px - ax) + (py - ay) * (py - ay));

      System.out.printf("%.3f %.3f %.3f\n", px, py, r);
    }
  }
}
