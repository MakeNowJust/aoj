import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
 
public class Main {
  static Scanner scan = new Scanner(System.in);
 
  static final int PRIME_MAX = 60000;
  static boolean[] p = new boolean[PRIME_MAX];
  static {
    p[0] = p[1] = true;
    for (int i = 4; i < PRIME_MAX; i += 2) {
      p[i] = true;
    }
    for (int i = 3; i < PRIME_MAX; i += 2) {
      if (!p[i]) {
        for (int j = i * 2; j < PRIME_MAX; j += i) {
          p[j] = true;
        }
      }
    }
  }
 
  public static void main(String[] args) {
    while (scan.hasNext()) {
      int n = scan.nextInt();
 
      int min, max = min = 0;
      for (int i = n-1; i >= 0; i--) {
        if (!p[i]) {
          min = i;
          break;
        }
      }
      for (int i = n+1; i < PRIME_MAX; i++) {
        if (!p[i]) {
          max = i;
          break;
        }
      }
      System.out.printf("%d %d\n", min, max);
    }
  }
}
