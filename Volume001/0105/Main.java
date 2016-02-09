import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    new BufferedReader(new InputStreamReader(System.in))
      .lines()
      .map(l -> l.split(" "))
      .collect(
          () -> new TreeMap<String, TreeSet<Integer>>(),
          (b, l) -> b.computeIfAbsent(l[0], s -> new TreeSet<>()).add(Integer.valueOf(l[1])),
          (b1, b2) -> b2.forEach((k, v) -> b1.computeIfAbsent(k, s -> new TreeSet<>()).addAll(v)))
      .forEach((k, v) -> {
        System.out.println(k);
        System.out.println(v.stream().map(String::valueOf).collect(Collectors.joining(" ")));
      });
  }
}
