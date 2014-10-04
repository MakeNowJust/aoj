import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      boolean[] cards = new boolean[11];
      int sum = 0;
      for (int i = 0; i < 3; i++) {
        int c = scan.nextInt();
        cards[c] = true;
        if (i < 2) {
          sum += c;
        }
      }

      double ans = 0;
      for (int i = 1; i <= 10; i++) {
        if (!cards[i] && sum + i <= 20) {
          ans += 1.0 / 7.0;
        }
      }

      System.out.println(ans >= 0.5 ? "YES" : "NO");
    }
  }
}
