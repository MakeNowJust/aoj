import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    int n = 0;

    double[] xs = new double[20];
    double[] ys = new double[20];

    while (scan.hasNextDouble()) {
      xs[n] = scan.nextDouble();
      ys[n] = scan.nextDouble();
      n += 1;
    }

    double s = 0;
    for (int i = 1; i < n - 1; i++) {
      double x1 = xs[0];
      double x2 = xs[i];
      double x3 = xs[i + 1];
      double y1 = ys[0];
      double y2 = ys[i];
      double y3 = ys[i + 1];
      double a = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
      double b = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
      double c = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
      double z = (a + b + c) / 2;
      s += Math.sqrt(z * (z - a) * (z - b) * (z - c));
    }

    System.out.println(s);
  }
}
