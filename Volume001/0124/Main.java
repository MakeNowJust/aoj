import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    boolean flag = false;
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      if (flag) System.out.println();
      flag = true;

      ArrayList<Team> teams = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        teams.add(new Team(scan.next(), scan.nextInt() * 3 + scan.nextInt() * 0 + scan.nextInt() * 1));
      }

      teams.stream()
        .sorted(Comparator.comparing(Team::getPoint).reversed())
        .forEach(System.out::println);
    }
  }

  static class Team {
    public String name;
    public int point;

    public Team(String name, int point) {
      this.name = name;
      this.point = point;
    }

    public int getPoint() {
      return point;
    }

    public String toString() {
      return String.format("%s,%d", name, point);
    }
  }
}
