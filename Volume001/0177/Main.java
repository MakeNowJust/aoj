import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static double r = 6378.1;

  public static void main(String... args) {
    for (;;) {
      double lat1 = scan.nextDouble();
      double lon1 = scan.nextDouble();
      double lat2 = scan.nextDouble();
      double lon2 = scan.nextDouble();
      if (lat1 == -1 && lon1 == -1 && lat2 == -1 && lon2 == -1) break;

      double a = lat1 * Math.PI / 180;
      double b = lon1 > 180 ? lon1 - 360 : lon1;
      double c = lat2 * Math.PI / 180;
      double d = lon2 > 180 ? lon2 - 360 : lon2;

      System.out.println((int)Math.round(r * Math.acos(Math.sin(a) * Math.sin(c) + Math.cos(a) * Math.cos(c) * Math.cos((d - b) * Math.PI / 180))));
    }
  }
}
