import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scan.nextInt(); scan.nextLine();
    for (int i = 0; i < n; i++) {
      s = scan.nextLine().toCharArray();
      p = 0;
      System.out.println(expr());
    }
  }

  static char[] s;
  static int p;

  static int expr() {
    int n = term();
    while (s[p] == '+' || s[p] == '-') {
      switch (s[p++]) {
      case '+':
        n += term();
        break;
      case '-':
        n -= term();
        break;
      }
    }
    return n;
  }

  static int term() {
    int n = fact();
    while (s[p] == '*' || s[p] == '/') {
      switch (s[p++]) {
      case '*':
        n *= fact();
        break;
      case '/':
        n /= fact();
        break;
      }
    }
    return n;
  }

  static int fact() {
    char c;
    int n;
    switch (c = s[p++]) {
    case '+':
      return fact();
    case '-':
      return -fact();
    case '(':
      n = expr();
      p++; // skip ')'
      return n;
    default:
      n = 0;
      do {
        n *= 10;
        n += c - '0';
        c = s[p++];
      } while ('0' <= c && c <= '9');
      p -= 1;
      return n;
    }
  }
}
