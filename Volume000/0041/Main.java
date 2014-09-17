import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int[] d = {
        scan.nextInt(),
        scan.nextInt(),
        scan.nextInt(),
        scan.nextInt(),
      };
      if (d[0] == 0 && d[1] == 0 && d[2] == 0 && d[3] == 0) {
        break;
      }

      String ans = solve(0, d, new Num[4]);
      if (ans == null) {
        ans = "0";
      }
      System.out.println(ans);
    }
  }

  static String solve(int n, int[] d, Num s[]) {
    if (n < 4) {
      for (int j = 0; j < 4; j++) {
        if (d[j] != -1) {
          int tmp = d[j];
          s[n] = new Num(d[j]);
          d[j] = -1;
          String ans = solve(n + 1, d, s);
          d[j] = tmp;
          if (ans != null) return ans;
        }
      }
    } else {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          for (int k = 0; k < 3; k++) {
            Expr e1 = new Op(i, new Op(j, s[0], s[1]), new Op(k, s[2], s[3]));
            if (e1.calc() == 10) {
              return e1.toString();
            }
            Expr e2 = new Op(i, s[0], new Op(j, new Op(k, s[1], s[2]), s[3]));
            if (e2.calc() == 10) {
              return e2.toString();
            }
            Expr e3 = new Op(i, s[0], new Op(j, s[1], new Op(k, s[2], s[3])));
            if (e3.calc() == 10) {
              return e3.toString();
            }
            Expr e4 = new Op(i, new Op(j, new Op(k, s[0], s[1]), s[2]), s[3]);
            if (e4.calc() == 10) {
              return e4.toString();
            }
          }
        }
      }
    }
    return null;
  }

  static interface Expr {
    String toString();
    int calc();
  }

  static final int ADD = 0;
  static final int SUB = 1;
  static final int MUL = 2;

  static class Op implements Expr {
    Expr left, right;
    int op;

    public Op(int op, Expr left, Expr right) {
      this.op = op;
      this.left = left;
      this.right = right;
    }

    public int calc() {
      int l = left.calc();
      int r = right.calc();
      switch (op) {
      case ADD:
        return l + r;
      case SUB:
        return l - r;
      case MUL:
        return l * r;
      }
      return 0;
    }

    public String toString() {
      String l = left.toString();
      String r = right.toString();
      if (left instanceof Op) {
        l = "(" + l + ")";
      }
      if (right instanceof Op) {
        r = "(" + r + ")";
      }
      String o = "";
      switch (op) {
      case ADD:
        o = "+"; break;
      case SUB:
        o = "-"; break;
      case MUL:
        o = "*"; break;
      }
      return String.format("%s%s%s", l, o, r);
    }
  }

  static class Num implements Expr {
    int i;

    public Num(int i) {
      this.i = i;
    }

    public int calc() {
      return i;
    }

    public String toString() {
      return String.valueOf(i);
    }
  }
}
