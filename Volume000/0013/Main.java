import java.io.*;
import java.util.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    Deque<Integer> q = new ArrayDeque<Integer>();

    while (scan.hasNext()) {
      int n = scan.nextInt();
      if (n == 0) {
        System.out.println(q.pop());
      } else {
        q.push(n);
      }
    }
  }
}
