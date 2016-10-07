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
      int a = scan.nextInt();
      int b = scan.nextInt();
      if ((a | b) == 0) break;
      int i = 0;
      if (a < b) {
        int tmp = a;
        a = b;
        b = tmp;
      }
      while (b > 0) {
        i += 1;
        int tmp = b;
        b = a % b;
        a = tmp;
      }
      System.out.printf("%d %d%n", a, i);
    }
  }
}
