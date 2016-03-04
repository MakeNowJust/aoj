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
    Pattern a = Pattern.compile("^>'(=+)#\\1~$");
    Pattern b = Pattern.compile("^>\\^(?:Q=)+~~$");
    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      String s = scan.next();
      System.out.println(a.matcher(s).find() ? "A" : b.matcher(s).find() ? "B" : "NA");
    }
  }
}
