import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static String[] names = {
    "light fly",
    "fly",
    "bantam",
    "feather",
    "light",
    "light welter",
    "welter",
    "light middle",
    "middle",
    "light heavy",
    "heavy",
  };

  static double[] weights = {
    48,
    51,
    54,
    57,
    60,
    64,
    69,
    75,
    81,
    91,
  };

  public static void main(String[] args) {
    while (scan.hasNext()) {
      double w = scan.nextDouble();

      int i = 0;
      for (; i < weights.length; i++) {
        if (w <= weights[i]) {
          break;
        }
      }
      System.out.println(names[i]);
    }
  }
}
