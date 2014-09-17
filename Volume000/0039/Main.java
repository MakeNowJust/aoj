import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static Map<Character, Integer> map = new HashMap<Character, Integer>();
  static {
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
  }

  public static void main(String[] args) {
    while (scan.hasNext()) {
      String line = scan.next();

      int m = 0;
      int last = Integer.MAX_VALUE;
      for (int i = 0; i < line.length(); i++) {
        char c = line.charAt(i);
        int x = map.get(c);
        m += x;
        if (last < x) {
          m -= last * 2;
        }
        last = x;
      }
      System.out.println(m);
    }
  }
}
