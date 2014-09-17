import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);
  static final int N = 1000000;
  static boolean[] ps = new boolean[N];
  static int[] cs = new int[N];

  public static void main(String[] args) {
    ps[0] = ps[1] = true;
    cs[0] = cs[1] = 0;
    for (int i = 4; i < N; i += 2) {
      ps[i] = true;
    }
    int c = 1;
    for (int i = 3; i < N; i += 2) {
      cs[i - 1] = c;
      if (!ps[i]) {
        c += 1;
        for (int j = i * 2; j < N; j += i) {
          ps[j] = true;
        }
      }
      cs[i] = c;
    }

    while (scan.hasNext()) {
      int a = scan.nextInt();
      System.out.println(cs[a]);
    }
  }
}
