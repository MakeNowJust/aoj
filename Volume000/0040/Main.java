import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Pattern pat = Pattern.compile("\\b(this|that)\\b");
    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    for (int i = 0; i < 26; i++) {
      int[] ans = new int[2];
      if (extgcd(26, i, ans) == 1) {
        m.put(i, ans[1]);
      }
    }

    int n = scan.nextInt();
    scan.nextLine();
    for (int i = 0; i < n; i++) {
      String text = scan.nextLine();

      search:
      for (int a : m.keySet()) {
        int invA = m.get(a);

        for (int b = 0; b < 26; b++) {
          char[] cs = text.toCharArray();
          for (int j = 0; j < cs.length; j++) {
            if (cs[j] == ' ') continue;
            cs[j] -= 'a';
            cs[j] = (char)((26*100 + (cs[j] - b) * invA) % 26);
            cs[j] += 'a';
          }
          String s = new String(cs);
          if (pat.matcher(s).find()) {
            System.out.println(s);
            break search;
          }
        }
      }
    }
  }

  static int extgcd(int a, int b, int[] ans) {
    int d = a;
    if (b != 0) {
      d = extgcd(b, a % b, swap(ans));
      swap(ans);
      ans[1] -= (a / b) * ans[0];
    } else {
      ans[0] = 1;
      ans[1] = 0;
    }
    return d;
  }

  static int[] swap(int[] ans) {
    int x = ans[0];
    ans[0] = ans[1];
    ans[1] = x;
    return ans;
  }
}
