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
      char[] s = scan.next().toCharArray();
      if (s.length == 1 && s[0] == '0') break;
      int a = 0, b = 0;
      for (int i = 1; i < s.length; i++) {
        if (s[i] == 'A') a += 1;
        else if (s[i] == 'B') b += 1;
      }

      System.out.printf("%d %d\n", a + (a > b ? 1 : 0), b + (b > a ? 1 : 0));
    }
  }
}
