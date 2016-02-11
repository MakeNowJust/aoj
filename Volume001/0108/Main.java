import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;
      int[] s = new int[n];

      for (int i = 0; i < n; i++) {
        s[i] = scan.nextInt();
      }
      int c = 0;
      loop: for (;;) {
        int[] old = new int[n];
        for (int i = 0; i < n; i++) old[i] = s[i];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
          map.put(s[i], map.getOrDefault(s[i], 0) + 1);
        }
        for (int i = 0; i < n; i++) {
          s[i] = map.get(s[i]);
        }
        for (int i = 0; i < n; i++) {
          if (s[i] != old[i]) {
            c += 1;
            continue loop;
          }
        }
        break;
      }
      System.out.println(c);
      for (int i = 0; i < n; i++) {
        System.out.printf("%s%d", i == 0 ? "" : " ", s[i]);
      }
      System.out.println();
    }
  }
}
