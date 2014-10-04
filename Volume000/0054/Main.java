import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      int n = scan.nextInt();

      int sum = 0;
      int div = a / b;
      int mod = a % b;
      a = mod * 10;
      for (int i = 0; i < n; i++) {
        div = a / b;
        mod = a % b;
        sum += div;
        a = mod * 10;
      }

      System.out.println(sum);
    }
  }
}
