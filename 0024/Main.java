import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      double minv = scan.nextDouble();
      double t = minv / 9.8;
      double y = 4.9 * t * t;
      System.out.println((int)(Math.ceil(y / 5.0) + 1.0));
    }
  }
}
