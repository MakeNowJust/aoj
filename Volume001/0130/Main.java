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
    int n = Integer.parseInt(scan.nextLine());
    for (int i = 0; i < n; i++) {
      String[] t = scan.nextLine().split("(?=(?:<-|->))");
      String s = t[0];
      int k = 0;
      for (int j = 1; j < t.length; j++) {
        if (t[j].charAt(1) == '>') {
          k += 1;
          if (s.length() == k) {
            s = s + t[j].charAt(2);
          }
        } else {
          if (k == 0) {
            s = t[j].charAt(2) + s;
          } else {
            k -= 1;
          }
        }
      }
      System.out.println(s);
    }
  }
}
