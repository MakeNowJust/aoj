import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    String s = scan.nextLine();
    String ans = "";
    for (int i = 0; i < s.length(); ) {
      if (s.startsWith("apple", i)) {
        ans += "peach";
        i += 5;
      } else if (s.startsWith("peach", i)) {
        ans += "apple";
        i += 5;
      } else {
        ans += s.charAt(i);
        i += 1;
      }
    }
    System.out.println(ans);
  }
}
