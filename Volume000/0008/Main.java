import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int n = scan.nextInt();

      int ans = 0;
      for (int a = 0; a <= 9; a++) {
        for (int b = 0; b <= 9; b++) {
          for (int c = 0; c <= 9; c++) {
            int d = n - a - b - c;
            if (d < 0) break;
            if (d < 10) {
              ans += 1;
            }
          }
        }
      }

      System.out.println(ans);
    }
  }
}
