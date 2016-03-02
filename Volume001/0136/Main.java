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
    int n = scan.nextInt();
    int[] c = new int[6];
    for (int i = 0; i < n; i++) {
      double w = scan.nextDouble();
      boolean ok = false;
      for (int j = 0; 165 + j * 5 <= 185; j++) {
        if (w < 165 + j * 5) {
          c[j] += 1;
          ok = true;
          break;
        }
      }
      if (!ok) c[5]++;
    }
    for (int i = 1; i <= 6; i++) {
      System.out.printf("%d:%s\n", i, new String(new char[c[i - 1]]).replace("\0", "*"));
    }
  }
}
