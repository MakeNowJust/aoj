import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    int rect = 0;
    int lozen = 0;
    while (scan.hasNext()) {
      int l1 = scan.nextInt();
      int l2 = scan.nextInt();
      int d = scan.nextInt();

      // 長方形
      if (l1 * l1 + l2 * l2 == d * d) {
        rect += 1;
      }
      // ひし形
      if (l1 == l2 && l1 + l2 > d) {
        lozen += 1;
      }
    }

    System.out.println(rect);
    System.out.println(lozen);
  }
}
