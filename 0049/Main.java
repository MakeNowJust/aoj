import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    List<String> s = Arrays.asList("A", "B", "AB", "O");
    int[] d = new int[4];
    while (scan.hasNext()) {
      int i = scan.nextInt();
      String b = scan.next();
      d[s.indexOf(b)] += 1;
    }
    for (int a : d) {
      System.out.println(a);
    }
  }
}
