import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    loop: while (scan.hasNextLine()) {
      String[] abc = scan.nextLine().split("[+=]");
      boolean flag = false;
      for (int i = 0; i < 3; i++) {
        flag = flag || (abc[i].startsWith("X") && abc[i].length() >= 2);
      }
      for (int i = flag ? 1 : 0; i <= 9; i++) {
        String x = String.valueOf(i);
        BigDecimal a = new BigDecimal(abc[0].replaceAll("X", x));
        BigDecimal b = new BigDecimal(abc[1].replaceAll("X", x));
        BigDecimal c = new BigDecimal(abc[2].replaceAll("X", x));
        if (a.add(b).equals(c)) {
          System.out.println(x);
          continue loop;
        }
      }
      System.out.println("NA");
    }
  }
}
