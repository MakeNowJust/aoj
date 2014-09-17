import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int w = scan.nextInt();
    int n = scan.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      String[] line = scan.next().split(",");
      a[i] = Integer.parseInt(line[0], 10) - 1;
      b[i] = Integer.parseInt(line[1], 10) - 1;
    }

    int[] ans = new int[w];

    for (int j = 0; j < w; j++) {
      int c = j;
      for (int i = 0; i < n; i++) {
        if (a[i] == c) {
          c = b[i];
        } else if (b[i] == c) {
          c = a[i];
        }
      }
      ans[c] = j;
    }

    for (int j = 0; j < w; j++) {
      System.out.println(ans[j] + 1);
    }
  }
}
