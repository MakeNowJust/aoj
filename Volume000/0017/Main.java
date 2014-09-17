import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Pattern pat = Pattern.compile("\\b(the|this|that)\\b");

    while (scan.hasNext()) {
      String line = scan.nextLine();
      char[] cs = line.toCharArray();

      for (int i = 1; i <= 26; i++) {
        for (int j = 0; j < cs.length; j++) {
          if ('a' <= cs[j] && cs[j] <= 'z') {
            cs[j] = (char)((cs[j] - 'a' + 1) % 26 + (int)'a');
          }
        }
        String s = new String(cs);
        if (pat.matcher(s).find()) {
          System.out.println(s);
          break;
        }
      }
    }
  }
}
