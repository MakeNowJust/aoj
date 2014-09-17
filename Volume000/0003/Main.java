import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      int[] as = {
        scan.nextInt(),
        scan.nextInt(),
        scan.nextInt(),
      };
      Arrays.sort(as);
      boolean flag = as[0] * as[0] + as[1] * as[1] == as[2] * as[2];
      System.out.println(flag ? "YES" : "NO");
    }
  }
}
