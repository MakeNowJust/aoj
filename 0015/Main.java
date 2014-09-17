import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();

    for (int i = 0; i < n; i++) {
      BigInteger a = scan.nextBigInteger();
      BigInteger b = scan.nextBigInteger();

      BigInteger c = a.add(b);
      String s = c.toString();
      System.out.println(s.length() > 80 ? "overflow" : s);
    }
  }
}
