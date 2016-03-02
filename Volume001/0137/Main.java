import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    int n = scan.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.printf("Case %d:\n", i);
      int x = scan.nextInt();
      for (int j = 0; j < 10; j++) {
        x = (x * x) / 100 % 10000;
        System.out.println(x);
      }
    }
  }
}
