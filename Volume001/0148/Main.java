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
    while (scan.hasNextInt()) {
      int n = scan.nextInt();
      System.out.printf("3C%02d\n", (n - 1) % 39 + 1);
    }
  }
}
