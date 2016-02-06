import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int maxa = n + 1;
    int maxv = 0;
    for (int i = 0; i < n; i++) {
      int a = scan.nextInt();
      int v = scan.nextInt();
      if (v > maxv || (v == maxv && a < maxa)) {
        maxa = a;
        maxv = v;
      }
    }
    System.out.printf("%d %d\n", maxa, maxv);
  }
}
