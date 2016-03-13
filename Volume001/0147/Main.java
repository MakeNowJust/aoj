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
    int[] seats = new int[17];
    for (int i = 0; i < 17; i++) seats[i] = -1;

    PriorityQueue<Event> q = new PriorityQueue<>();
    for (int i = 0; i < 100; i++) {
      q.offer(new Event(i, i * 5, Event.Type.In));
    }

    int[] ans = new int[100];
    LinkedList<Integer> w = new LinkedList<Integer>();
    while (!q.isEmpty()) {
      Event e = q.poll();

      switch (e.type) {
      case Out:
        {
          int i = e.id;
          remove(seats, i);
          while (!w.isEmpty()) {
            int j = w.peek();
            if (set(seats, j)) {
              ans[j] = e.time - j * 5;
              w.poll();
              q.offer(new Event(j, e.time + 17 * (j % 2) + 3 * (j % 3) + 19, Event.Type.Out));
            } else {
              break;
            }
          }
          break;
        }
      case In:
        {
          int i = e.id;
          if (w.isEmpty() && set(seats, i)) {
            ans[i] = 0;
            q.offer(new Event(i, e.time + 17 * (i % 2) + 3 * (i % 3) + 19, Event.Type.Out));
          } else {
            w.offer(i);
          }
          break;
        }
      }
    }

    while (scan.hasNextInt()) {
      int n = scan.nextInt();
      System.out.println(ans[n]);
    }
  }

  static void remove(int[] seats, int i) {
    for (int j = 0; j < seats.length; j++) {
      if (seats[j] == i) seats[j] = -1;
    }
  }

  static boolean set(int[] seats, int i) {
    int n = i % 5 == 1 ? 5 : 2;

    loop:
    for (int j = 0; j < seats.length - n + 1; j++) {
      for (int k = 0; k < n; k++) {
        if (seats[j + k] != -1) continue loop;
      }

      for (int k = 0; k < n; k++) {
        seats[j + k] = i;
      }
      return true;
    }

    return false;
  }

  static class Event implements Comparable<Event> {
    public int id;
    public int time;

    enum Type {
      Out,
      In,
    }

    public Type type;

    public Event(int id, int time, Type type) {
      this.id = id;
      this.time = time;
      this.type = type;
    }

    @Override
    public int compareTo(Event event) {
      return time != event.time ? time - event.time : type.ordinal() - event.type.ordinal();
    }
  }
}
