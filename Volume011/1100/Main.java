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
    for (int r = 1; ; r++) {
      int n = scan.nextInt();
      if (n == 0) break;

      float[] xs = new float[n];
      float[] ys = new float[n];
      for (int i = 0; i < n; i++) {
        xs[i] = scan.nextInt();
        ys[i] = scan.nextInt();
      }

      float s = 0;
      for (int i = 1; i < n - 1; i++) {
        float a = xs[i] - xs[0];
        float b = ys[i] - ys[0];
        float c = xs[i + 1] - xs[0];
        float d = ys[i + 1] - ys[0];
        s += a * d - b * c;
      }

      System.out.printf("%d %.1f\n", r, Math.abs(s) / 2);
    }
  }
}
