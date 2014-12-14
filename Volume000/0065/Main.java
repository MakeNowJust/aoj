import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    TreeMap<Integer, HashSet<Integer>> current = new TreeMap<Integer, HashSet<Integer>>();
    TreeMap<Integer, HashSet<Integer>> last    = new TreeMap<Integer, HashSet<Integer>>();
    boolean flag = false;

    while (scan.hasNext()) {
      String line = scan.nextLine();
      if (line.isEmpty()) {
        flag = true;
        continue;
      }

      String[] data = line.split(",");
      int to = Integer.parseInt(data[0], 10);
      int day = Integer.parseInt(data[1], 10);

      TreeMap<Integer, HashSet<Integer>> target = flag ? last : current;

      if (!target.containsKey(to)) {
        target.put(to, new HashSet<Integer>());
      }
      target.get(to).add(day);
    }

    for (int to : current.keySet()) {
      if (last.containsKey(to)) {
        System.out.printf("%d %d\n", to, current.get(to).size() + last.get(to).size());
      }
    }
  }
}
