import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int[] dp = new int[4001];
    for (int i = 0; i <= 1000; i++) {
      dp[i] = 1;
    }
    for (int i = 2; i <= 4; i++) {
      for (int j = 4000; j >= 0; j--) {
        for (int k = 1; k <= 1000; k++) {
          int jk = j - k;
          dp[j] += jk >= 0 ? dp[jk] : 0;
        }
      }
    }
    while (scan.hasNextInt()) {
      System.out.println(dp[scan.nextInt()]);
    }
  }
}
