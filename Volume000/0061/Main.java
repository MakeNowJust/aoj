import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
    boolean[] p = new boolean[31];
    for (;;) {
      int n = scan.nextInt();
      int s = scan.nextInt();
      if (n == 0 && s == 0) break;
      m.put(n, s);
      p[s] = true;
    }

    while (scan.hasNext()) {
      int n = scan.nextInt();
      int s = m.get(n);
      int r = 0;
      for (int i = 30; i >= s; i--) {
        if (p[i]) {
          r += 1;
        }
      }
      System.out.println(r);
    }
  }
}
