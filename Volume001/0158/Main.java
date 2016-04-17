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
      if (n == 0) break;
      int i;
      for (i = 0; n != 1; i++) {
        if (n % 2 == 0) {
          n /= 2;
        } else {
          n = n * 3 + 1;
        }
      }
      System.out.println(i);
    }
  }
}
