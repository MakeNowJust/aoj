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
    ArrayList<Player> ps = new ArrayList<>();
    ArrayList<Player> p1 = new ArrayList<>();
    ArrayList<Player> p2 = new ArrayList<>();
    ArrayList<Player> p3 = new ArrayList<>();

    for (int i = 0; i < 8; i++) {
      Player p = new Player(scan.nextInt(), scan.nextDouble());
      ps.add(p);
      p1.add(p);
    }
    for (int i = 0; i < 8; i++) {
      Player p = new Player(scan.nextInt(), scan.nextDouble());
      ps.add(p);
      p2.add(p);
    }
    for (int i = 0; i < 8; i++) {
      Player p = new Player(scan.nextInt(), scan.nextDouble());
      ps.add(p);
      p3.add(p);
    }

    HashSet<Integer> already = new HashSet<>();
    Collections.sort(p1, Comparator.comparing(Player::getTime));
    Collections.sort(p2, Comparator.comparing(Player::getTime));
    Collections.sort(p3, Comparator.comparing(Player::getTime));
    Collections.sort(ps, Comparator.comparing(Player::getTime));
    System.out.println(p1.get(0));
    already.add(p1.get(0).id);
    System.out.println(p1.get(1));
    already.add(p1.get(1).id);
    System.out.println(p2.get(0));
    already.add(p2.get(0).id);
    System.out.println(p2.get(1));
    already.add(p2.get(1).id);
    System.out.println(p3.get(0));
    already.add(p3.get(0).id);
    System.out.println(p3.get(1));
    already.add(p3.get(1).id);
    for (int i = 0; i < 2; ) {
      Player p = ps.remove(0);
      if (!already.contains(p.id)) {
        System.out.println(p);
        already.add(p.id);
        i += 1;
      }
    }
  }

  static class Player {
    public int id;
    public double time;

    public Player(int id, double time) {
      this.id = id;
      this.time = time;
    }

    public double getTime() {
      return time;
    }

    @Override
    public String toString() {
      return String.format("%d %.2f", id, time);
    }
  }
}
