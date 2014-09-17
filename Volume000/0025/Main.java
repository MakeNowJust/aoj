import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      Set<Integer> set = new HashSet<Integer>();
      int[] a = new int[4];
      for (int i = 0; i < 4; i++) {
        a[i] = scan.nextInt();
        set.add(a[i]);
      }

      int hit = 0, blow = 0;
      for (int i = 0; i < 4; i++) {
        int b = scan.nextInt();
        if (b == a[i]) {
          hit += 1;
        } else if (set.contains(b)) {
          blow += 1;
        }
      }
      System.out.printf("%d %d\n", hit, blow);
    }
  }
}
