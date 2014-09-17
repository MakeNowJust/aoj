import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    long s = 0;
    long m = 0;
    int i = 0;
    while (scan.hasNext()) {
      int p = scan.nextInt();
      int n = scan.nextInt();
      s += p * n;
      m += n;
      i += 1;
    }
    System.out.printf("%d\n", s);
    System.out.printf("%.0f\n", (double)m / (double)i);
  }
}
