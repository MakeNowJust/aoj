import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
public class Main { static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      String line = scan.next();
      int[] s = new int[9];
      for (int i = 0; i < line.length(); i++) {
        s[line.charAt(i) - '1'] += 1;
      }

      List<Integer> ans = solve(s);
      if (ans.isEmpty()) {
        ans.add(0);
      }
      boolean first = true;
      for (int a : ans) {
        System.out.printf("%s%d", first ? "" : " ", a);
        first = false;
      }
      System.out.println("");
    }
  }

  static List<Integer> solve(int[] s) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 9; i++) {
      s[i] += 1;
      if (s[i] <= 4 && head(s)) {
        list.add(i + 1);
      }
      s[i] -= 1;
    }
    return list;
  }

  static boolean head(int[] s) {
    for (int i = 0; i < 9; i++) {
      if (s[i] >= 2) {
        s[i] -= 2;
        boolean flag = body(s, 12);
        s[i] += 2;
        if (flag) {
          return true;
        }
      }
    }
    return false;
  }

  static boolean body(int[] s, int n) {
    if (n == 0) return true;

    for (int i = 0; i < 9; i++) {
      if (s[i] >= 3) {
        s[i] -= 3;
        boolean flag = body(s, n - 3);
        s[i] += 3;
        if (flag) return true;
      }
    }
    for (int i = 0; i < 9 - 2; i++) {
      if (s[i] >= 1 && s[i + 1] >= 1 && s[i + 2] >= 1) {
        s[i] -= 1; s[i + 1] -= 1; s[i + 2] -= 1;
        boolean flag = body(s, n - 3);
        s[i] += 1; s[i + 1] += 1; s[i + 2] += 1;
        if (flag) return true;
      }
    }
    return false;
  }
}
