import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    while (scan.hasNext()) {
      int[] s = new int[10];
      for (int i = 0; i < 10; i++) {
        s[i] = (i == 0 ? 0 : s[i - 1]) + scan.nextInt();
      }
      int len = s[9];
      int v1 = scan.nextInt();
      int v2 = scan.nextInt();

      // 連立方程式
      // y =  x * v1
      // y = -x * v2 + len
      double x = (double)len / (double)(v1 + v2);
      double y = v1 * x;

      for (int i = 0; i < 10; i++) {
        if (s[i] >= y) {
          System.out.println(i + 1);
          break;
        }
      }
    }
  }
}
