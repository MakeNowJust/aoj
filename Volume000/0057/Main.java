import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int n = scan.nextInt();

      long ans = 1;
      for (int i = 1; i <= n; i++) {
        ans += i;
      }

      System.out.println(ans);
    }
  }
}
