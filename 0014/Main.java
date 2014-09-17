import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNext()) {
      int d = scan.nextInt();

      long m = 0;
      for (int i = d; i < 600; i += d) {
        m += i * i * d;
      }

      System.out.println(m);
    }
  }
}
