import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      double ax = scan.nextDouble();
      double ay = scan.nextDouble();
      double ar = scan.nextDouble();
      double bx = scan.nextDouble();
      double by = scan.nextDouble();
      double br = scan.nextDouble();

      int ans = 0;
      double d = Math.sqrt((ax - bx) * (ax - bx) + (ay - by) * (ay - by));
      double r1 = ar + br;
      double r2 = Math.abs(ar - br);
      if (r1 < d) {
        ans = 0;
      } else if (r2 <= d && d <= r1) {
        ans = 1;
      } else if (d < r2) {
        ans = ar > br ? 2 : -2;
      }
      System.out.println(ans);
    }
  }
}
