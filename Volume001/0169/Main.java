import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    for (;;) {
      String[] l = scan.nextLine().split(" ");
      if (l.length == 1 && l[0].equals("0")) break;

      int c1 = 0;
      int h = 0;
      for (int i = 0; i < l.length; i++) {
        int x = Integer.parseInt(l[i], 10);
        if (x == 1) c1++;
        h += x == 1 ? 11 : Math.min(10, x);
      }

      while (h > 21 && c1 > 0) {
        c1 -= 1;
        h -= 10;
      }

      System.out.println(h > 21 ? 0 : h);
    }
  }
}
