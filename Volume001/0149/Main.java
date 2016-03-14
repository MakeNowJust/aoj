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
    HashMap<String, Integer> hash = new HashMap<>();
    hash.put("0.1", 3);
    for (int i = 2; i < 6; i++) hash.put(String.format("0.%s", i), 2);
    for (int i = 6; i < 11; i++) hash.put(String.format("%s.%s", i / 10, i % 10), 1);

    int[] l = new int[4];
    int[] r = new int[4];
    while (scan.hasNext()) {
      l[hash.getOrDefault(scan.next(), 0)]++;
      r[hash.getOrDefault(scan.next(), 0)]++;
    }

    for (int i = 0; i < 4; i++) {
      System.out.printf("%d %d\n", l[i], r[i]);
    }
  }
}
