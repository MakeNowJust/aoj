import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static String[] names = {
    "black",
    "blue",
    "lime",
    "aqua",
    "red",
    "fuchsia",
    "yellow",
    "white",
  };

  static int[][] values = {
    {0x00, 0x00, 0x00},
    {0x00, 0x00, 0xff},
    {0x00, 0xff, 0x00},
    {0x00, 0xff, 0xff},
    {0xff, 0x00, 0x00},
    {0xff, 0x00, 0xff},
    {0xff, 0xff, 0x00},
    {0xff, 0xff, 0xff},
  };

  public static void main(String... args) {
    for (;;) {
      String s = scan.next();
      if (s.equals("0")) break;

      int r = Integer.parseInt(s.substring(1, 3), 16);
      int g = Integer.parseInt(s.substring(3, 5), 16);
      int b = Integer.parseInt(s.substring(5, 7), 16);

      String minName = null;
      double minD = Double.POSITIVE_INFINITY;

      for (int i = 0; i < names.length; i++) {
        double d = Math.sqrt(Math.pow(r - values[i][0], 2) + Math.pow(g - values[i][1], 2) + Math.pow(b - values[i][2], 2));
        if (d < minD) {
          minName = names[i];
          minD = d;
        }
      }

      System.out.println(minName);
    }
  }
}
