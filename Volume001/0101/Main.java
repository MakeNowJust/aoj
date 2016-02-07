import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    scan.nextLine();
    for (int i = 0; i < n; i++) {
      System.out.println(scan.nextLine().replaceAll("Hoshino", "Hoshina"));
    }
  }
}
