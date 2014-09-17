import java.io.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] hs = new int[10];
    for (int i = 0; i < 10; i++) {
      hs[i] = scan.nextInt();
    }
    Arrays.sort(hs);
    System.out.println(hs[9]);
    System.out.println(hs[8]);
    System.out.println(hs[7]);
  }
}
