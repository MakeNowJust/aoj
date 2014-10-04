import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[] f = new int[20001];

  public static void main(String[] args) {
    for (int i = 1, j = 0; i < 20001; i++) {
      if (i % 5 == 0) {
        int p = i;
        while (p != 0 && p % 5 == 0) {
          p /= 5;
          j += 1;
        }
      }
      f[i] = j;
    }

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      System.out.println(f[n]);
    }
  }
}
