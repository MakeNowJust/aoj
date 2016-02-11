import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      if ((a | b | c) == 0) break;
      double[] pat = {
        Math.sqrt(a * a + b * b),
        Math.sqrt(a * a + b * b),
        Math.sqrt(b * b + c * c),
      };
      int n = scan.nextInt();
      for (int i = 0; i < n; i++) {
        double r = scan.nextDouble();
        boolean flag = false;
        for (int j = 0; j < 3; j++) {
          if (r * 2 > pat[j]) {
            flag = true;
            break;
          }
        }
        System.out.println(flag ? "OK" : "NA");
      }
    }
  }
}
