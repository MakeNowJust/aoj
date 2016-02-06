import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    double a = scan.nextDouble();
    double b = scan.nextDouble();

    System.out.printf("%.8f\n", (a * b) / 3.305785);
  }
}
