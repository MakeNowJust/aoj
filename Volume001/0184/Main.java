import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;
      int[] cnt = new int[7];
      for (int i = 0; i < n; i++) {
        cnt[Math.min(6, scan.nextInt() / 10)] += 1;
      }
      for (int i = 0; i < 7; i++) {
        System.out.println(cnt[i]);
      }
    }
  }
}
