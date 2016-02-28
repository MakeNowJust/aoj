import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static String[] table = {
    "abcde",
    "fghij",
    "klmno",
    "pqrst",
    "uvwxy",
    "z.?! ",
  };

  public static void main(String... args) {
    loop:
    while (scan.hasNextLine()) {
      String s = scan.nextLine();
      if (s.length() % 2 != 0) {
        System.out.println("NA");
        continue;
      }

      String a = "";
      for (int i = 0; i < s.length(); i += 2) {
        int x = s.charAt(i) - '1';
        int y = s.charAt(i + 1) - '1';
        if (x < 0 || 6 <= x || y < 0 || 5 <= y) {
          System.out.println("NA");
          continue loop;
        }
        a += table[x].charAt(y);
      }
      System.out.println(a);
    }
  }
}
