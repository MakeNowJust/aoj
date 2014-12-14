import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      String line = scan.next();
      int[] xs = new int[10];
      for (int i = 0; i < 10; i++) {
        xs[i] = line.charAt(i) - '0';
      }

      for (int i = 10; i > 1; i--) {
        for (int j = 1; j < i; j++) {
          xs[j - 1] = (xs[j - 1] + xs[j]) % 10;
        }
      }

      System.out.println(xs[0]);
    }
  }
}
