import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int[] as = new int[5];
    for (int i = 0; i < 5; i++) {
      as[i] = scan.nextInt();
    }
    Arrays.sort(as);
    for (int i = 4; i >= 0; i--) {
      System.out.printf("%d%s", as[i], i == 0 ? "\n" : " ");
    }
  }
}
