import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      double xA1 = scan.nextDouble();
      double yA1 = scan.nextDouble();
      double xA2 = scan.nextDouble();
      double yA2 = scan.nextDouble();
      double xB1 = scan.nextDouble();
      double yB1 = scan.nextDouble();
      double xB2 = scan.nextDouble();
      double yB2 = scan.nextDouble();

      if (xA1 <= xB2 && xB1 <= xA2 &&
          yA1 <= yB2 && yB1 <= yA2) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
