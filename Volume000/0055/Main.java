import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      double a = scan.nextDouble();
      double s = a;
      for (int i = 2; i <= 10; i++) {
        if (i % 2 == 0) {
          a *= 2;
        } else {
          a /=3;
        }
        s += a;
      }
      System.out.println(s);
    }
  }
}
