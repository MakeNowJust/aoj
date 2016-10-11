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
      int n = scan.nextInt();
      int m = scan.nextInt();
      if ((n | m) == 0) break;
      char[] c = new char[n];
      for (int i = 0; i < n; i++) c[i] = '#';
      for (int i = 0; i < m; i++) {
        String a = scan.next();
        boolean f = false;
        switch (a) {
        case "A":
          for (int j = 0; j < n; j++) {
            if (c[j] == '#') {
              c[j] = 'A';
              break;
            }
          }
          break;
        case "B":
          for (int j = n - 1; j >= 0; j--) {
            if (c[j] != '#') continue;
            if (j + 1 < n && c[j + 1] == 'A') continue;
            if (j - 1 >= 0 && c[j - 1] == 'A') continue;
            f = true;
            c[j] = 'B';
            break;
          }
          if (f) break;
          for (int j = 0; j < n; j++) {
            if (c[j] == '#') {
              c[j] = 'B';
              break;
            }
          }
          break;
        case "C":
          if (i == 0) {
            c[n / 2] = 'C';
          } else {
            for (int j = 0; j < n; j++) {
              if (c[j] != '#') {
                if (j + 1 < n && c[j + 1] == '#') {
                  c[j + 1] = 'C';
                  break;
                } else if (j - 1 >= 0 && c[j - 1] == '#') {
                  c[j - 1] = 'C';
                  break;
                }
              }
            }
          }
          break;
        case "D":
          if (i == 0) {
            c[0] = 'D';
          } else {
            int jj = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
              int d1 = 0, d2 = 0;
              for (int k = j; k >= 0 && c[k] == '#'; k--) d1++;
              for (int k = j; k < n && c[k] == '#'; k++) d2++;
              int d = Math.min(j - d1 < 0 ? Integer.MAX_VALUE : d1, j + d2 >= n ? Integer.MAX_VALUE : d2);
              if (max < d) {
                jj = j;
                max = d;
              }
            }
            c[jj] = 'D';
          }
          break;
        }
      }
      System.out.println(new String(c));
    }
  }
}
