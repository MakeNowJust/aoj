import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      int[] t = new int[n];
      for (int i = 0; i < n; i++) {
        t[i] = scan.nextInt();
      }
      Arrays.sort(t);

      long w = 0, s = 0;
      for (int i = 0; i < n; i++) {
        s += w;
        w += t[i];
      }
      System.out.println(s);
    }
  }
}
