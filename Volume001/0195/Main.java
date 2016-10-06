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
      String ans = "A";
      int max = scan.nextInt() + scan.nextInt();
      if (max == 0) break;
      for (String name : new String[]{"B", "C", "D", "E"}) {
        int n = scan.nextInt() + scan.nextInt();
        if (n > max) {
          max = n;
          ans = name;
        }
      }
      System.out.printf("%s %d%n", ans, max);
    }
  }
}
