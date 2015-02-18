import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(,|\\n)\\s*");

    while (scan.hasNext()) {
      int id = scan.nextInt();
      double w = scan.nextDouble();
      double h = scan.nextDouble();

      double bmi = w / h / h;
      if (bmi >= 25) {
        System.out.println(id);
      }
    }
  }
}
