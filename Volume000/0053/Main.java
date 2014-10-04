import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[] p = new int[10000];

  public static void main(String[] args) {
    int idx = 0;
    p[idx++] = 2;
    p[idx++] = 3;
    for (int i = 5; ; i += 2) {
      boolean flag = true;
      for (int j = 0; p[j] * p[j] <= i; j++) {
        if (i % p[j] == 0) {
          flag = false;
          break;
        }
      }
      if (flag) {
        p[idx++] = i;
      }

      if (idx == 10000) break;
    }

    for (;;) {
      int n = scan.nextInt();
      if (n == 0) return;

      long sum = 0;
      for (int i = 0; i < n; i++) {
        sum += p[i];
      }

      System.out.println(sum);
    }
  }
}
