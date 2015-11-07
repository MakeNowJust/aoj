import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*(\\n|,)\\s*");

    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      int len = line.length();
      StringBuilder result = new StringBuilder(len);

      for (int i = 0; i < len; i++) {
        char c = line.charAt(i);
        if (c == '@') {
          int n = line.charAt(++i) - '0';
          char x = line.charAt(++i);
          for (int j = 0; j < n; j++) {
            result.append(x);
          }
        } else {
          result.append(c);
        }
      }
      
      System.out.println(result.toString());
    }
  }
}
