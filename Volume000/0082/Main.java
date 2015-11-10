import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int[] p = new int[8];
      for (int i = 0; i < 8; i++) {
        p[i] = scan.nextInt();
      }

      int n = 10000000;
      int a = 8;
      int[] c = new int[]{4, 1, 4, 1, 2, 1, 2, 1};
      for (int i = 0; i < 8; i++) {
        int s = 0;
        for (int j = 0; j < 8; j++) {
          s += Math.max(0, p[j] - c[(j + i) % 8]);
        }
        if (a == 8 || s < n || s == n && num(c, i) < num(c, a)) {
          n = s;
          a = i;
        }
      }

      for (int i = 0; i < 8; i++) {
        if (i != 0) System.out.printf(" ");
        System.out.printf("%d", c[(i + a) % 8]);
      }
      System.out.println();
    }
  }

  static int num(int[] c, int a) {
    int n = 0;
    for (int i = 0; i < 8; i++) {
      n = n * 10 + c[(i + a) % 8];
    }
    return n;
  }
}
