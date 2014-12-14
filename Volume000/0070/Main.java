import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static int[][] table = new int[11][331];

  public static void main(String[] args) {
    createTable(0, 0, 0);

    while (scan.hasNext()) {
      int n = scan.nextInt();
      int s = scan.nextInt();

      System.out.println(s > 330 ? 0 : table[n][s]);
    }
  }

  static void createTable(int n, int s, int flag) {
    table[n][s] += 1;
    for (int i = 0; i < 10; i++) {
      if ((flag & (1 << i)) == 0) {
        createTable(n + 1, s + i * (n + 1), flag | (1 << i));
      }
    }
  }
}
