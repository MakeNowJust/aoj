import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int a, b;

    while (scan.hasNext()) {
      a = scan.nextInt();
      b = scan.nextInt();

      System.out.println(String.valueOf(a + b).length());
    }
  }
}
