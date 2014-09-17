import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    String s = scan.nextLine();

    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.print(s.charAt(i));
    }
    System.out.print("\n");
  }
}
