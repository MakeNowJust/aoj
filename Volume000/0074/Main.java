import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int h = scan.nextInt();
      int m = scan.nextInt();
      int s = scan.nextInt();
      if (h == -1 && m == -1 && s == -1) break;

      int t = h * 3600 + m * 60 + s;

      int d = (2 * 3600) - t;
      System.out.printf("%02d:%02d:%02d\n", d / 3600, (d % 3600) / 60, (d % 3600 % 60));
      d *= 3;
      System.out.printf("%02d:%02d:%02d\n", d / 3600, (d % 3600) / 60, (d % 3600 % 60));
    }
  }
}
