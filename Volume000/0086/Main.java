import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int[] count = new int[101];
      for (;;) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == 0 && b == 0) break;
        count[a] += 1;
        count[b] += 1;
      }

      boolean ok = true;
      for (int i = 1; i <= 2; i++) {
        if (count[i] % 2 != 1) {
          ok = false;
        }
      }
      for (int i = 3; i <= 100; i++) {
        if (count[i] % 2 != 0) {
          ok = false;
        }
      }

      System.out.println(ok ? "OK" : "NG");
    }
  }
}
