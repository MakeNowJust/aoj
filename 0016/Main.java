import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    double x = 0, y = 0;
    double r = Math.PI / 2.0;
    
    scan.useDelimiter("\\s*,\\s*|\\n");

    while (scan.hasNext()) {
      int m = scan.nextInt();
      int n = scan.nextInt();
      if (m == 0 && n == 0) break;

      x += Math.cos(r) * m;
      y += Math.sin(r) * m;
      r += - n / 180.0 * Math.PI;
    }

    System.out.println((long)x);
    System.out.println((long)y);
  }
}
