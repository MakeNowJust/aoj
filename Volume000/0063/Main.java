import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int ans = 0;
    loop: while (scan.hasNext()) {
      String line = scan.next();
      int len = line.length();
      for (int i = 0; i <= len/2; i++) {
        if (line.charAt(i) != line.charAt(len - i - 1)) continue loop;
      }
      ans += 1;
    }

    System.out.println(ans);
  }
}
