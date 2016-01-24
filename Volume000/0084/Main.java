import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("[ .,]+");
    boolean f = false;
    while (scan.hasNext()) {
      String w = scan.next();
      if (3 <= w.length() && w.length() <= 6) {
        System.out.print((f ? " " : "") + w);
        f = true;
      }
    }
    System.out.println();
  }
}
