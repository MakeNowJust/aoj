import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int h, w;
  static char[][] c;
  static char t;

  public static void main(String[] args) {
    for (;;) {
      h = scan.nextInt();
      w = scan.nextInt();
      if ((h | w) == 0) break;

      scan.nextLine();
      c = new char[h][];
      for (int i = 0; i < h; i++) {
        c[i] = scan.nextLine().toCharArray();
      }

      int ans = 0;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if (c[i][j] != ' ') {
            ans += 1;
            Cont cont = new Cont(i, j);
            t = c[i][j];
            while (!cont.stack.isEmpty()) {
              try {
                Cont.Context ctx = cont.stack.pollFirst();
                mark(ctx.i, ctx.j);
              } catch (Cont e) {
                cont.stack.addAll(e.stack);
              }
            }
          }
        }
      }

      System.out.println(ans);
    }
  }

  static void mark(int i, int j) throws Cont {
    c[i][j] = ' ';

    try {
      if (i - 1 >= 0 && c[i - 1][j] == t) mark(i - 1, j);
      if (i + 1 <  h && c[i + 1][j] == t) mark(i + 1, j);
      if (j - 1 >= 0 && c[i][j - 1] == t) mark(i, j - 1);
      if (j + 1 <  w && c[i][j + 1] == t) mark(i, j + 1);
    } catch (StackOverflowError e) {
      throw new Cont(i, j);
    } catch (Cont cont) {
      cont.add(i, j);
      throw cont;
    }
  }

  static class Cont extends Throwable {
    public int i, j;
    public LinkedList<Context> stack = new LinkedList<Context>();
    public Cont(int i, int j) {
      stack.add(new Context(i, j));
    }

    public void add(int i, int j) {
      stack.add(new Context(i, j));
    }

    static class Context {
      public int i, j;
      public Context(int i, int j) {
        this.i = i;
        this.j = j;
      }
    }
  }
}
