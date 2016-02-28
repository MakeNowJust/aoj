import java.io.*;
import java.util.*;
import java.math.*;
import java.time.*;
import java.time.temporal.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int y1 = scan.nextInt();
      int m1 = scan.nextInt();
      int d1 = scan.nextInt();
      int y2 = scan.nextInt();
      int m2 = scan.nextInt();
      int d2 = scan.nextInt();
      if (y1 < 0 || m1 < 0 || d1 < 0 || y2 < 0 || m2 < 0 || d2 < 0) break;

      LocalDate date1 = LocalDate.of(y1, m1, d1);
      LocalDate date2 = LocalDate.of(y2, m2, d2);
      System.out.println(date1.until(date2, ChronoUnit.DAYS));
    }
  }
}
