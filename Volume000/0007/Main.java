import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    long m = 100000;
    long n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      m += m / 100 * 5;
      if (m % 1000 != 0) {
        m = (m / 1000 + 1) * 1000;
      }
    }

    System.out.println(m);
  }
}
