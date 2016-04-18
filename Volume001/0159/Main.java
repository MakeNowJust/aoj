import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static final double EPS = 1e-9;

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;
      double min = Double.POSITIVE_INFINITY;
      int minId = 0;
      for (int i = 0; i < n; i++) {
        int id = scan.nextInt();
        double h = scan.nextDouble();
        double w = scan.nextDouble();
        double bmi = w / Math.pow(h / 100.0, 2);
        double d = Math.abs(22.0 - bmi);
        if (d - min < EPS || Math.abs(min - d) <= EPS && id < minId) {
          min = d;
          minId = id;
        }
      }
      System.out.println(minId);
    }
  }
}
