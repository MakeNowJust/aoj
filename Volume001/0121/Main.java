import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    LinkedList<Pair<Integer, Integer>> queue = new LinkedList<>();
    HashMap<Integer, Integer> hash = new HashMap<>();

    int start = 0;
    for (int i = 0; i <= 7; i++) {
      start |= i << (i * 3);
    }
    queue.offer(new Pair<>(0, start));

    while (!queue.isEmpty()) {
      Pair<Integer, Integer> top = queue.poll();
      int n = top.fst;
      int s = top.snd;

      if (n >= hash.getOrDefault(s, Integer.MAX_VALUE)) continue;
      hash.put(s, n);

      int i = find0(s);
      if (i != 0 && i != 4) {
        int t = swap(s, i - 1, i);
        queue.offer(new Pair<>(n + 1, t));
      }
      if (i != 3 && i != 7) {
        int t = swap(s, i, i + 1);
        queue.offer(new Pair<>(n + 1, t));
      }
      {
        int t = swap(s, i, (i + 4) % 8);
        queue.offer(new Pair<>(n + 1, t));
      }
    }

    while (scan.hasNextInt()) {
      int s = 0;
      for (int i = 0; i <= 7; i++) {
        s |= scan.nextInt() << (i * 3);
      }
      System.out.println(hash.get(s));
    }
  }

  static int find0(int s) {
    for (int i = 0; i <= 7; i++) {
      if (((s >> (i * 3)) & 7) == 0) return i;
    }
    return -1;
  }

  static int swap(int s, int i, int j) {
    int x = (s >> (i * 3)) & 7;
    int y = (s >> (j * 3)) & 7;
    s &= ~(7 << (i * 3));
    s &= ~(7 << (j * 3));
    s |= y << (i * 3);
    s |= x << (j * 3);
    return s;
  }

  static class Pair<A, B> {
    public A fst;
    public B snd;

    public Pair(A a, B b) {
      fst = a;
      snd = b;
    }
  }
}
