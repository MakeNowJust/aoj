import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int x = scan.nextInt();

    for (int k = 0; k < x; k++) {
      String s = scan.next();
      int[] n = new int[10];
      for (char c : s.toCharArray()) {
        n[c - '0'] += 1;
      }
      long min = 0, max = 0;
      for (int i = 0, p = 1; i < 10; i++) {
        for (int j = 0; j < n[i]; j++, p *= 10) {
          max += i * p;
        }
      }
      for (int i = 9, p = 1; i >= 0; i--) {
        for (int j = 0; j < n[i]; j++, p *= 10) {
          min += i * p;
        }
      }

      System.out.println(max - min);
    }
  }
}
