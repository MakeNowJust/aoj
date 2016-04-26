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
      int m = scan.nextInt();
      if (m == 0) break;
      double dm = 0;
      int sm = 360;
      for (int i = 0; i < m - 1; i++) {
        int v = scan.nextInt();
        dm += Math.sin(v * Math.PI / 180);
        sm -= v;
      }
      dm += Math.sin(sm * Math.PI / 180);

      int n = scan.nextInt();
      double dn = 0;
      int sn = 360;
      for (int i = 0; i < n - 1; i++) {
        int v = scan.nextInt();
        dn += Math.sin(v * Math.PI / 180);
        sn -= v;
      }
      dn += Math.sin(sn * Math.PI / 180);

      System.out.println(Math.abs(dn - dm) < 1e-8 ? 0 : dm > dn ? 1 : dm < dn ? 2 : 0);
    }
  }
}
