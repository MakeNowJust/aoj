import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    loop: while (scan.hasNext()) {
      char[] board = scan.next().toCharArray();

      // 縦
      for (int i = 0; i < 3; i++) {
        if (board[i] != 's' && board[i] == board[i + 3] &&
            board[i] == board[i + 6]) {
          System.out.println(board[i]);
          continue loop;
        }
      }

      // 横
      for (int i = 0; i < 9; i += 3) {
        if (board[i] != 's' && board[i] == board[i + 1] &&
            board[i] == board[i + 2]) {
          System.out.println(board[i]);
          continue loop;
        }
      }

      // 斜め
      if (board[0] != 's' && board[0] == board[4] && board[0] == board[8]) {
        System.out.println(board[0]);
        continue loop;
      }
      if (board[2] != 's' && board[2] == board[4] && board[2] == board[6]) {
        System.out.println(board[2]);
        continue loop;
      }

      System.out.println('d');
    }
  }
}
