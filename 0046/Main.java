import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    double min = Double.POSITIVE_INFINITY;
    double max = Double.NEGATIVE_INFINITY;

    while (scan.hasNext()) {
      double h = scan.nextDouble();
      min = Math.min(min, h);
      max = Math.max(max, h);
    }
    System.out.println(max - min);
  }
}
