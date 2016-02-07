import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    int q = scan.nextInt();
    int[] vs = new int[n + 1];
    PriorityQueue<Status> p = new PriorityQueue<>();

    for (int i = 0; i < q; i++) {
      int a = scan.nextInt();
      vs[a] += scan.nextInt();

      p.add(new Status(a, vs[a]));

      for (;;) {
        Status s = p.peek();
        if (s.v == vs[s.a]) {
          System.out.printf("%d %d\n", s.a, s.v);
          break;
        } else {
          p.poll();
        }
      }
    }
  }

  static class Status implements Comparable<Status> {
    public int a, v;

    public Status(int a, int v) {
      this.a = a;
      this.v = v;
    }

    public String toString() {
      return "<a=" + a + ",v=" + v + ">";
    }

    @Override
    public int compareTo(Status that) {
      return that.v != this.v ? that.v - this.v : this.a - that.a;
    }
  }
}
