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
      String s = scan.next();
      if (s.equals("0")) break;
      for (int i = 0; i < 2; i++) s += scan.next();
      char[] c = s.toCharArray();
      char w = 0;
      for (int i = 0; i < 9; i += 3) {
        if (c[i] != '+' && c[i] == c[i + 1] && c[i + 1] == c[i + 2]) w = c[i];
      }
      for (int i = 0; i < 3; i += 1) {
        if (c[i] != '+' && c[i] == c[i + 3] && c[i + 3] == c[i + 6]) w = c[i];
      }
      if (c[0] != '+' && c[0] == c[4] && c[4] == c[8]) w = c[0];
      if (c[2] != '+' && c[2] == c[4] && c[4] == c[6]) w = c[2];
      System.out.println(w == 0 ? "NA" : w + "");
    }
  }
}
