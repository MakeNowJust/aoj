import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static final String NULL = "null";
  static final String ONE_PAIR = "one pair";
  static final String TWO_PAIR = "two pair";
  static final String THREE_CARD = "three card";
  static final String STRAIGHT = "straight";
  static final String FULL_HOUSE = "full house";
  static final String FOUR_CARD = "four card";

  public static void main(String[] args) {
    scan.useDelimiter("\\s*,\\s*|\\n");

    while (scan.hasNext()) {
      int[] numbers = new int[13];
      for (int i = 0; i < 5; i++) {
        numbers[scan.nextInt() - 1] += 1;
      }

      String set = NULL;
      for (int i = 0; i < 13; i++) {
        switch (numbers[i]) {
        case 2:
          if (set.equals(NULL)) set = ONE_PAIR;
          else if (set.equals(ONE_PAIR)) set = TWO_PAIR;
          else if (set.equals(THREE_CARD)) set = FULL_HOUSE;
          break;
        case 3:
          if (set.equals(NULL)) set = THREE_CARD;
          if (set.equals(ONE_PAIR)) set = FULL_HOUSE;
          break;
        case 4:
          set = FOUR_CARD;
          break;
        }
      }

      if (set.equals(NULL)) {
        check_straight:
        for (int i = 0; i < 10; i++) {
          if (numbers[i] == 1) {
            for (int j = i; j < i + 5; j++) {
              if (numbers[j % 13] != 1) {
                continue check_straight;
              }
            }
            set = STRAIGHT;
          }
        }
      }

      System.out.println(set);
    }
  }
}
