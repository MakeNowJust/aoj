import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    while (scan.hasNextInt()) {
      int q = scan.nextInt();
      if (q == -1) break;

      double xn = q / 2.0;
      while (Math.abs(xn * xn * xn - q) >= 0.00001 * q) {
        xn = xn - (xn * xn * xn - q) / (3 * xn * xn);
      }

      System.out.println(xn);
    }
  }
}
