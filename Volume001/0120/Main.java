import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static double[] r = new double[12];
  static double[][] dp = new double[12][1 << 12];

  public static void main(String[] args) {
    while (scan.hasNextLine()) {
      String[] line = scan.nextLine().split(" ");
      double l = Double.valueOf(line[0]);
      int n = line.length - 1;
      for (int i = 0; i < n; i++) {
        Arrays.fill(dp[i], 0, 1 << n, Double.POSITIVE_INFINITY);
        dp[i][1 << i] = r[i] = Double.valueOf(line[i + 1]);
      }

      for (int bits = 1; bits < (1 << n); bits++) {
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) {
            if ((bits & (1 << i)) == 0 || (bits & (1 << j)) > 0) continue;
            int ubits = bits | (1 << j);
            double ucost = dp[i][bits]
                         + Math.sqrt(Math.pow(r[i] + r[j], 2) - Math.pow(r[i] - r[j], 2))
                         + (ubits == (1 << n) - 1 ? r[j] : 0);
            dp[j][ubits] = Math.min(dp[j][ubits], ucost);
          }
        }
      }

      double min = Double.POSITIVE_INFINITY;
      for (int i = 0; i < n; i++) min = Math.min(min, dp[i][(1 << n) - 1]);

      System.out.println(l >= min ? "OK" : "NA");
    }
  }
}
