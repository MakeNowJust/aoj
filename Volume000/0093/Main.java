import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    boolean first = true;
    for (;;) {
      int a = scan.nextInt();
      int b = scan.nextInt();
      if (a == 0 && b == 0) break;
      if (first) {
        first = false;
      } else {
        System.out.println();
      }

      boolean flag = true;
      for (int i = a; i <= b; i++) {
        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
          System.out.println(i);
          flag = false;
        }
      }
      if (flag) {
        System.out.println("NA");
      }
    }
  }
}
