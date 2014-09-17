import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    while (scan.hasNext()) {
      list.add(scan.nextInt());
    }

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    Map<Integer, Set<Integer>> inv = new HashMap<Integer, Set<Integer>>();
    int max = 0;
    for (int a : list) {
      int count = 0;
      if (map.containsKey(a)) {
        count = map.get(a);
      }
      count += 1;
      map.put(a, count);
      max = Math.max(max, count);

      if (!inv.containsKey(count)) {
        inv.put(count, new TreeSet<Integer>());
      }
      inv.get(count).add(a);
    }

    List<Integer> ans = new ArrayList<Integer>(inv.get(max));
    for (int a : ans) {
      System.out.println(a);
    }
  }
}
