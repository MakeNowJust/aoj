import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int y = scan.nextInt();
      int m = scan.nextInt();
      int d = scan.nextInt();
      int ymd = d + m * 100 + y * 10000;

      if (ymd >= 19890108) {
        System.out.printf("heisei %d %d %d\n", y - 1988, m, d);
      } else if (ymd >= 19261225) {
        System.out.printf("showa %d %d %d\n", y - 1925, m, d);
      } else if (ymd >= 19120730) {
        System.out.printf("taisho %d %d %d\n", y - 1911, m, d);
      } else if (ymd >= 18680908) {
        System.out.printf("meiji %d %d %d\n", y - 1867, m, d);
      } else {
        System.out.println("pre-meiji");
      }
    }
  }
}
