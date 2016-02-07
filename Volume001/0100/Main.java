import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    BigDecimal max = new BigDecimal("1000000");
    for (;;) {
      int n = scan.nextInt();
      if (n == 0) break;

      LinkedHashMap<Integer, BigDecimal> workers = new LinkedHashMap<>();
      for (int i = 0; i < n; i++) {
        int id = scan.nextInt();
        long p = scan.nextLong();
        long q = scan.nextLong();
        BigDecimal sale = workers.get(id);
        if (sale == null) {
          workers.put(id, new BigDecimal(p * q));
        } else {
          workers.put(id, sale.add(new BigDecimal(p * q)));
        }
      }

      boolean flag = true;
      for (Map.Entry<Integer, BigDecimal> e : workers.entrySet()) {
        int id = e.getKey();
        BigDecimal sale = e.getValue();
        if (sale.compareTo(max) >= 0) {
          System.out.println(id);
          flag = false;
        }
      }
      if (flag) {
        System.out.println("NA");
      }
    }
  }
}
