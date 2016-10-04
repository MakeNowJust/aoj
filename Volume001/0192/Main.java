import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    for (;;) {
      int m = scan.nextInt(); // 駐車スペースの数
      int n = scan.nextInt(); // 駐車する車の数
      if (m == 0 && n == 0) break;
      int[] t = new int[n];
      for (int i = 0; i < n; i++) t[i] = scan.nextInt();
      int s = 0;
      ArrayList<Integer> ans = new ArrayList<>();
      ArrayDeque<Integer> q = new ArrayDeque<>();
      int[] p = new int[m * 2];
      for (int i = 0; i < m * 2; i++) p[i] = -1;
      while (ans.size() < n) {
        if (s % 10 == 0 && s / 10 < n)
          q.addLast(s / 10);
        for (int i = 0; i < m * 2; i++)
          if (p[i] != -1) t[p[i]] -= 1;
        for (int i = 0; i < m; i++)
          while (p[i * 2] != -1 && t[p[i * 2]] <= 0) {
            ans.add(p[i * 2] + 1);
            p[i * 2] = p[i * 2 + 1];
            p[i * 2 + 1] = -1;
          }
        while (!q.isEmpty()) {
          int id = q.removeFirst();
          int rt = t[id];
          boolean ok = false;
          for (int i = 0; i < m; i++)
            if (p[i * 2] == -1) {
              p[i * 2] = id;
              ok = true;
              break;
            }
          if (ok) continue;

          int umin = Integer.MAX_VALUE;
          int dmin = Integer.MAX_VALUE;
          int u = -1;
          int d  = -1;
          for (int i = 0; i < m; i++)
            if (p[i * 2 + 1] == -1)
              if (t[p[i * 2]] >= rt) {
                if (t[p[i * 2]] - rt < umin) {
                  umin = t[p[i * 2]] - rt;
                  u = i;
                }
              } else {
                if (rt - t[p[i * 2]] < dmin) {
                  dmin = rt - t[p[i * 2]];
                  d = i;
                }
              }
          if (u != -1) {
            p[u * 2 + 1] = p[u * 2];
            p[u * 2] = id;
          } else if (d != -1) {
            p[d * 2 + 1] = p[d * 2];
            p[d * 2] = id;
          } else {
            q.addFirst(id);
            break;
          }
        }
        s += 1;
      }
      System.out.println(String.join(" ", ans.stream().map(String::valueOf).collect(Collectors.toList())));
    }
  }
}
