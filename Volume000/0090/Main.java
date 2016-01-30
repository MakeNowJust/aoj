import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);
  static final double EPS = 1e-5;

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");
    double[] x = new double[100];
    double[] y = new double[100];

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      for (int i = 0; i < n; i++) {
        x[i] = scan.nextDouble();
        y[i] = scan.nextDouble();
      }

      int max = 1;
      for (int i = 0; i < n; i++) {
        double xi = x[i];
        double yi = y[i];
        for (int j = i + 1; j < n; j++) {
          double xj = x[j];
          double yj = y[j];
          double xij = xj - xi;
          double yij = yj - yi;
          double l = xij * xij + yij * yij;

          if (l <= 4.0) {
            l = Math.sqrt(l);
            double t = Math.atan(yij / xij);
            double a = Math.acos(l / 2);

            double[][] cross = new double[2][];
            cross[0] = new double[]{xi + Math.cos(t + a), yi + Math.sin(t + a)};
            cross[1] = new double[]{xi + Math.cos(t - a), yi + Math.sin(t - a)};

            for (double[] xyc : cross) {
              double xc = xyc[0];
              double yc = xyc[1];

              int c = 0;
              for (int k = 0; k < n; k++) {
                double xck = x[k] - xc;
                double yck = y[k] - yc;
                if (xck * xck + yck * yck <= 1.0 + EPS) {
                  c += 1;
                }
              }
              if (c > max) {
                max = c;
              }
            }
          }
        }
      }

      System.out.println(max);
    }
  }
}
