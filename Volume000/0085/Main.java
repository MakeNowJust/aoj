import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int n = scan.nextInt();
      int m = scan.nextInt();
      if (n == 0 && m == 0) break;

      HashSet<Integer> set = new HashSet<>();
      for (int i = 1; i <= n; i++) {
        set.add(i);
      }

      for (int i = 1, j = 1; set.size() > 1; i = i % n + 1) {
        if (set.contains(i)) {
          if (j == m) {
            j = 1;
            set.remove(i);
          } else {
            j += 1;
          }
        }
      }

      System.out.println(set.toArray()[0]);
    }
  }
}
