import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static final int[][] a = {
    { 60,  2,  600},
    { 80,  5,  800},
    {100, 10, 1000},
    {120, 15, 1200},
    {140, 20, 1400},
    {160, 25, 1600},
  };

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      long sum = 0;
      for (int i = 0; i < n; i++) {
        int x = scan.nextInt();
        int y = scan.nextInt();
        int h = scan.nextInt();
        int xyh = x + y + h;
        int w = scan.nextInt();

        for (int j = 0; j < a.length; j++) {
          if (xyh <= a[j][0] && w <= a[j][1]) {
            sum += a[j][2];
            break;
          }
        }
      }

      System.out.println(sum);
    }
  }
}
