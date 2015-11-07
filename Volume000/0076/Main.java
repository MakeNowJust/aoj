import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    while (scan.hasNext()) {
      int n = scan.nextInt();
      if (n == -1) break;

      double r = Math.PI; // 180deg
      double x = 1;
      double y = 0;
      for (int i = 2; i <= n; i++) {
        r -= Math.PI / 2; // -90deg
        x += Math.cos(r);
        y += Math.sin(r);
        r = Math.atan2(-y, -x);
      }

      System.out.println(x);
      System.out.println(y);
    }
  }
}
