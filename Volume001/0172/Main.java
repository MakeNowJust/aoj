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
      int m = scan.nextInt();
      if (n + m == 0) break;

      boolean[][] d = new boolean[n][n];

      for (int i = 0; i < m; i++) {
        int s = scan.nextInt() - 1;
        int t = scan.nextInt() - 1;
        d[s][t] = true;
        d[t][s] = true;
      }

      int l = 0;
      for (int i = 0; i < n; i++) l |= scan.nextInt() << i;

      int[][] r = new int[n][];
      for (int i = 0; i < n; i++) {
        int k = scan.nextInt();
        r[i] = new int[k];
        for (int j = 0; j < k; j++) r[i][j] = scan.nextInt() - 1;
        Arrays.sort(r[i]);
      }

      boolean[][] visited = new boolean[n][1 << n];
      ArrayDeque<State> queue = new ArrayDeque<>();
      if ((l & 1) != 0) queue.offer(new State(l, 0, 0, new Action(GO_HOME, 0)));

      State answer = null;
      boolean goalReachable = false;

      while (!queue.isEmpty()) {
        State state = queue.poll();

        if (visited[state.room][state.light]) continue;
        visited[state.room][state.light] = true;

        if (state.room == n - 1) {
          if (state.light == (1 << (n - 1))) {
            if (answer == null || answer.cost > state.cost) {
              answer = state;
            }
          }
          goalReachable = true;
        }

        //if (state.cost == 10) continue;

        for (int i = 0; i < r[state.room].length; i++) {
          if (state.room == r[state.room][i]) continue;

          int nextLight = state.light ^ (1 << r[state.room][i]);
          queue.add(new State(nextLight, state.room, state.cost + 1, 
                state.action.add((state.light & (1 << r[state.room][i])) == 0 ? SWITCH_ON : SWITCH_OFF, r[state.room][i] + 1)));
        }

        for (int i = 0; i < n; i++) {
          if (d[state.room][i] && (state.light & (1 << i)) != 0) {
            queue.add(new State(state.light, i, state.cost + 1, state.action.add(MOVE, i + 1)));
          }
        }
      }

      if (answer != null) {
        answer.show();
      } else if (goalReachable) {
        System.out.println("You can not switch off all lights.");
      } else {
        System.out.println("Help me!");
      }
    }
  }

  static class State {
    int light, room, cost;
    Action action;

    State(int light, int room, int cost, Action act) {
      this.light = light;
      this.room = room;
      this.cost = cost;
      this.action = act;
    }

    void show() {
      this.action.show(this.cost);
    }
  }

  static final int GO_HOME = 0;
  static final int MOVE = 1;
  static final int SWITCH_ON = 2;
  static final int SWITCH_OFF = 3;

  static class Action {
    Action prev;
    int action, value;

    Action(int action, int value) {
      this.prev = null;
      this.action = action;
      this.value = value;
    }

    Action add(int action, int value) {
      Action ret = new Action(action, value);
      ret.prev = this;
      return ret;
    }

    void show(int x) {
      if (prev != null) {
        prev.show(x);
      }

      switch (action) {
      case GO_HOME:
        System.out.printf("You can go home in %d steps.\n", x);
        break;
      case MOVE:
        System.out.printf("Move to room %d.\n", value);
        break;
      case SWITCH_ON:
        System.out.printf("Switch on room %d.\n", value);
        break;
      case SWITCH_OFF:
        System.out.printf("Switch off room %d.\n", value);
        break;
      }
    }
  }
}
