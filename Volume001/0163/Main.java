import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[][] p = {
    {0, 300, 500, 600, 700, 1350, 1650},
    {0,   0, 350, 450, 600, 1150, 1500},
    {0,   0,   0, 250, 400, 1000, 1350},
    {0,   0,   0,   0, 250,  850, 1300},
    {0,   0,   0,   0,   0,  600, 1150},
    {0,   0,   0,   0,   0,    0,  500},
  };

  static int[] d = {0, 6, 7, 5, 5, 20, 15};

  public static void main(String... args) {
    for (;;) {
      int s = scan.nextInt();
      if (s == 0) break;
      int sh = scan.nextInt();
      int sm = scan.nextInt();

      int g = scan.nextInt();
      int gh = scan.nextInt();
      int gm = scan.nextInt();

      int si = Math.min(s, g);
      int gi = Math.max(s, g);
      int ds = 0;
      for (int i = si; i < gi; i++) ds += d[i];
      boolean f = ds <= 40 && (include(sh, sm) || include(gh, gm));
      int ps = (s < g ? p[s - 1][g - 1] : p[g - 1][s - 1]) / 50;
      System.out.println((f ? (ps % 2 == 0 ? ps / 2 : ps / 2 + 1) : ps) * 50);
    }
  }

  static boolean include(int h, int m) {
    return h == 17 && m >= 30 || h == 19 && m <= 30 || 18 == h;
  }
}
