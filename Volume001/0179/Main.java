import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static char[][] tbl = new char[127][127];
  static {
    tbl['g']['b'] = tbl['b']['g'] = 'r';
    tbl['r']['g'] = tbl['g']['r'] = 'b';
    tbl['r']['b'] = tbl['b']['r'] = 'g';
  }

  public static void main(String... args) {
    for (;;) {
      char[] s = scan.next().toCharArray();
      int l = s.length;
      if (l == 1 && s[0] == '0') break;

      HashSet<String> set = new HashSet<>();
      ArrayDeque<State> queue = new ArrayDeque<>();
      queue.add(new State(0, s));

      int ans = -1;

      while (!queue.isEmpty()) {
        State t = queue.remove();
        String ts = new String(t.s);

        if (set.contains(ts)) continue;
        set.add(ts);

        boolean all = true;
        for (int i = 1; i < l; i++) {
          if (t.s[0] != t.s[i]) {
            all = false;
            break;
          }
        }
        if (all) {
          ans = t.n;
          break;
        }

        for (int i = 0; i < l - 1; i++) {
          if (t.s[i] != t.s[i + 1]) {
            char c0 = t.s[i];
            char c1 = t.s[i + 1];
            t.s[i] = t.s[i + 1] = tbl[t.s[i]][t.s[i + 1]];
            queue.add(new State(t.n + 1, t.s));
            t.s[i] = c0;
            t.s[i + 1] = c1;
          }
        }
      }

      System.out.println(ans == -1 ? "NA" : ans + "");
    }
  }

  static class State {
    int n;
    char[] s;

    State(int n, char[] s) {
      this.n = n;
      this.s = new String(s).toCharArray();
    }
  }
}
