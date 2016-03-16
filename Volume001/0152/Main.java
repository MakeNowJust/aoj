import java.io.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String... args) {
    for (;;) {
      int m = scan.nextInt();
      if (m == 0) break;
      Player[] ps = new Player[m];
      scan.nextLine();
      for (int i = 0; i < m; i++) {
        String[] line = scan.nextLine().split(" ");
        int id = Integer.parseInt(line[0]);
        int[] xs = new int[line.length - 1];
        for (int j = 1; j < line.length; j++) xs[j - 1] = Integer.parseInt(line[j]);
        int score = 0;
        int k = 0;
        for (int j = 0; j < 10; j++) {
          int fst = xs[k++];
          score += fst;
          if (fst == 10) {
            score += xs[k] + xs[k + 1];
            continue;
          }
          int snd = xs[k++];
          score += snd;
          if (fst + snd == 10) {
            score += xs[k];
          }
        }

        ps[i] = new Player(id, score);
      }

      Arrays.sort(ps, Comparator.comparingInt(Player::getScore).reversed().thenComparingInt(Player::getId));

      for (Player p : ps) {
        System.out.println(p);
      }
    }
  }

  static class Player {
    int id, score;
    public Player(int id, int score) {
      this.id = id;
      this.score = score;
    }

    public int getId() {
      return id;
    }

    public int getScore() {
      return score;
    }

    @Override
    public String toString() {
      return String.format("%d %d", id, score);
    }
  }
}
