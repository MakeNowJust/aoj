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
    int[] c = new int[31];
    c[0] = 1;
    for (int i = 0; i <= 30; i++) {
      for (int j = 1; j <= 3; j++) {
        if (i + j <= 30) c[i + j] += c[i];
      }
    }

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;
      System.out.println((int)Math.ceil(c[n] / 10. / 365));
    }
  }
}
