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
      int n = scan.nextInt();
      if (n == 0) break;
      TreeSet<Team> ans = new TreeSet<>(
        Comparator
          .comparing(Team::getWin, Comparator.reverseOrder())
          .thenComparing(Team::getLose)
          .thenComparing(Team::getOrder));
      for (int i = 0; i < n; i++) {
        String name = scan.next();
        int win = 0, lose = 0;
        for (int j = 0; j < n - 1; j++) {
          switch (scan.nextInt()) {
          case 0: win += 1; break;
          case 1: lose += 1; break;
          }
        }
        ans.add(new Team(name, win, lose, i));
      }
      for (Team team : ans) System.out.println(team.name);
    }
  }

  static class Team {
    String name;
    int win;
    int getWin() { return this.win; }
    int lose;
    int getLose() { return this.lose; }
    int order;
    int getOrder() { return this.order; }
    Team(String name, int win, int lose, int order) {
      this.name = name;
      this.win = win;
      this.lose = lose;
      this.order = order;
    }
  }
}
