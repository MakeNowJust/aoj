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
    char[][] p = new char[8][];
    for (int i = 0; i < 8; i++) {
      p[i] = scan.next().toCharArray();
    }
    for (int k = 1; k <= 3; k++) {
      char[][] q = new char[8][8];
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          q[i][j] = p[8 - j - 1][i];
        }
      }
      p = q;
      System.out.println(k * 90);
      for (int i = 0; i < 8; i++) {
        System.out.println(new String(p[i]));
      }
    }
  }
}
