import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    while (scan.hasNextLine()) {
      LinkedList<Double> stack = new LinkedList<>();
      for (String s : scan.nextLine().split(" ")) {
        double a1, a2;
        switch (s) {
        case "+":
          a2 = stack.pop();
          a1 = stack.pop();
          stack.push(a1 + a2);
          break;
        case "-":
          a2 = stack.pop();
          a1 = stack.pop();
          stack.push(a1 - a2);
          break;
        case "*":
          a2 = stack.pop();
          a1 = stack.pop();
          stack.push(a1 * a2);
          break;
        case "/":
          a2 = stack.pop();
          a1 = stack.pop();
          stack.push(a1 / a2);
          break;
        default:
          stack.push(Double.valueOf(s));
          break;
        }
      }
      System.out.printf("%.6f\n", stack.pop());
    }
  }
}
