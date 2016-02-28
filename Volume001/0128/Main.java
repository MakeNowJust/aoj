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
    boolean flag = false;

    while (scan.hasNextLine()) {
      if (flag) System.out.println();
      flag = true;

      String s = scan.nextLine();
      while (s.length() != 5) {
        s = '0' + s;
      }

      String[] ls = new String[5];
      for (int i = 0; i < 5; i++) {
        String l = "";
        int c = s.charAt(i) - '0';
        if (c >= 5) {
          c -= 5;
          l += " *";
        } else {
          l += "* ";
        }
        l += "=";
        char[] cs = {'*', '*', '*', '*', '*'};
        cs[c] = ' ';
        l += new String(cs);
        ls[i] = l;
      }
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 5; j++) {
          System.out.print(ls[j].charAt(i));
        }
        System.out.println();
      }
    }
  }
}
