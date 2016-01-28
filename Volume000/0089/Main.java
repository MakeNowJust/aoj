import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int[] xs = new int[51];
    boolean flag = true;
    int pl = 0;
    while (scan.hasNextLine()) {
      String[] line = scan.nextLine().split(",");
      if (pl > line.length) {
        flag = false;
      }

      int l = line.length;
      for (int i = 0; i < l; i++) {
        if (flag) {
          int y = Integer.parseInt(line[l - i - 1], 10);
          xs[l - i - 1] = y + Math.max(l - i - 2 < 0 ? 0 : xs[l - i - 2], xs[l - i - 1]);
        } else {
          int y = Integer.parseInt(line[i], 10);
          xs[i] = y + Math.max(xs[i], xs[i + 1]);
        }
      }

      pl = line.length;
    }

    System.out.println(xs[0]);
  }
}
