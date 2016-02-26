import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static String[] r  = {"AAA",  "AA",   "A",   "B",   "C",   "D",   "E",  "NA"};
  static double[] s1 = {35.50, 37.50, 40.00, 43.00, 50.00, 55.00, 70.00};
  static double[] s2 = {71.00, 77.00, 83.00, 89.00,105.00,116.00,148.00};

  public static void main(String[] args) {
    while (scan.hasNextDouble()) {
      double t1 = scan.nextDouble();
      double t2 = scan.nextDouble();
      int i1, i2;
      for (i1 = 0; i1 < s1.length; i1++) {
        if (t1 < s1[i1]) break;
      }
      for (i2 = 0; i2 < s2.length; i2++) {
        if (t2 < s2[i2]) break;
      }
      System.out.println(r[Math.max(i1, i2)]);
    }
  }
}
