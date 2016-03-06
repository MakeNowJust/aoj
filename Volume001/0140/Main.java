import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static BusStop[][] busStops = new BusStop[10][];
  static {
    busStops[0] = new BusStop[]{new BusStop(0)};
    for (int i = 1; i <= 5; i++) {
      busStops[i] = new BusStop[]{new BusStop(i), new BusStop(i)};
      busStops[i - 1][0].next = busStops[i][0];
      busStops[i][1].next = busStops[i - 1][i - 1 == 0 ? 0 : 1];
    }
    for (int i = 6; i <= 9; i++) {
      busStops[i] = new BusStop[]{new BusStop(i)};
      busStops[i - 1][0].next = busStops[i][0];
    }
    busStops[9][0].next = busStops[5][1];
  }

  public static void main(String... args) {
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      int s = scan.nextInt();
      int e = scan.nextInt();

      int min = Integer.MAX_VALUE;
      BusStop ans = null;
      for (BusStop start : busStops[s]) {
        int count = 0;
        BusStop now = start;
        while (now.id != e) {
          count += 1;
          now = now.next;
        }
        if (count < min) {
          min = count;
          ans = start;
        }
      }
      boolean flag = false;
      while (ans.id != e) {
        System.out.printf("%s%d", flag ? " " : "", ans.id);
        flag = true;
        ans = ans.next;
      }
      System.out.printf("%s%d", flag ? " " : "", ans.id);
      System.out.println();
    }
  }

  static class BusStop {
    public BusStop next;
    public int id;

    public BusStop(int id) {
      this.id = id;
    }
  }
}
