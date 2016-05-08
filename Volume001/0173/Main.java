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
    for (int i = 0; i < 9; i++) {
      String name = scan.next();
      int n = scan.nextInt();
      int m = scan.nextInt();

      System.out.printf("%s %d %d\n", name, n + m, n * 200 + m * 300);
    }
  }
}
