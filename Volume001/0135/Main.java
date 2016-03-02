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
    scan.useDelimiter("\\s*(\\n|:)\\s*");
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      double h = scan.nextDouble();
      double m = scan.nextDouble();
      double ha = (h * 60 + m) / 2;
      double ma = m * 6;
      double d = Math.min(Math.abs(ha - ma), 360 - Math.abs(ha - ma));
      System.out.println(d  < 30 ? "alert" :
                         90 <= d ? "safe"  : "warning");
    }
  }
}
