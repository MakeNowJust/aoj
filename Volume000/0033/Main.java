import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      String ans = "YES";

      int left = 0;
      int right = 0;
      for (int j = 0; j < 10; j++) {
        int a = scan.nextInt();
        if (a > left) {
          left = a;
        } else if (a > right) {
          right = a;
        } else {
          ans = "NO";
        }
      }
      
      System.out.println(ans);
    }
  }
}
