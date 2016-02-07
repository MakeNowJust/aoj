import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int base = 0;
      int out = 0;
      int score = 0;
      while (out < 3) {
        switch (scan.next()) {
        case "HIT":
          base = (base << 1) | 1;
          if (((base >> 3) & 1) == 1) {
            score += 1;
            base &= 0b111;
          }
          break;
        case "HOMERUN":
          score += 1 + (base & 1) + ((base >> 1) & 1) + ((base >> 2) & 1);
          base = 0;
          break;
        case "OUT":
          out += 1;
          break;
        }
      }
      System.out.println(score);
    }
  }
}
