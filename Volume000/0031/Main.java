import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int w = scan.nextInt();
      boolean first = true;
      for (int i = 0; i < 10; i++) {
        if ((w & (1 << i)) != 0) {
          if (!first) {
            System.out.print(" ");
          }
          first = false;
          System.out.print(1 << i);
        }
      }
      System.out.println("");;
    }
  }
}
