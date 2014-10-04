import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      double xA = scan.nextDouble();
      double yA = scan.nextDouble();
      double xB = scan.nextDouble();
      double yB = scan.nextDouble();
      double xC = scan.nextDouble();
      double yC = scan.nextDouble();
      double xD = scan.nextDouble();
      double yD = scan.nextDouble();

      double xAB = xB - xA;
      double yAB = yB - yA;
      double xCD = xD - xC;
      double yCD = yD - yC;

      if (Math.abs(xAB * xCD + yAB * yCD) <= 1e-11) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
