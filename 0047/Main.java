import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");
    
    String set = "ABC";
    boolean[] d = {true, false, false};
    while (scan.hasNext()) {
      String a = scan.next();
      String b = scan.next();
      swap(d, set.indexOf(a), set.indexOf(b));
    }
    int ans = 0;
    for (int i = 0; i < 3; i++) {
      if (d[i]) {
        ans = i;
        break;
      }
    }
    System.out.println(set.charAt(ans));
  }

  static void swap(boolean[] d, int i, int j) {
    boolean c = d[i];
    d[i] = d[j];
    d[j] = c;
  }
}
