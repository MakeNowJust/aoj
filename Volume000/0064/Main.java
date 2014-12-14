import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    scan.useDelimiter("[^0-9]+");
    int ans = 0;
    while (scan.hasNext()) {
      ans += scan.nextInt();
    }
    System.out.println(ans);
  }
}
