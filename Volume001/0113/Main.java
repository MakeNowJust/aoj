import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNextInt()) {
      int p = scan.nextInt();
      int q = scan.nextInt();
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; ; i++) {
        if (p == 0) {
          break;
        }
        map.put(p, i);
        int r = (p * 10) / q;
        System.out.print(r);
        p = p * 10 % q;
        if (map.containsKey(p)) {
          System.out.println();
          int n = map.get(p);
          for (int j = 0; j < n; j++) {
            System.out.print(" ");
          }
          for (int j = n; j <= i; j++) {
            System.out.print("^");
          }
          break;
        }
      }
      System.out.println();
    }
  }
}
