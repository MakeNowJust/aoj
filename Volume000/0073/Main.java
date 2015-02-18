import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      double x = scan.nextDouble();
      double h = scan.nextDouble();
      if (x == 0 && h == 0) break;

      // 底面
      double S1 = x * x;
      // 底面の一つの角から底面の中心までの距離
      double a = Math.sqrt(2 * x * x) / 2;
      // 底面の一つの角から頂点までの距離
      double b = Math.sqrt(a * a + h * h);
      // 側面の三角形の高さ
      double c = Math.sqrt(b * b - (x / 2) * (x / 2));
      // 側面の三角形の面積
      double S2 = x * c * 1/2;
      // 四角すいの面積
      double S = S1 + S2 * 4;

      System.out.println(S);
    }
  }
}
