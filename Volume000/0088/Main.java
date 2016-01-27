import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  static HashMap<Character, String> map1 = new HashMap<>();
  static {
    map1.put(' ' , "101");
    map1.put('\'', "000000");
    map1.put(',' , "000011");
    map1.put('-', "10010001");
    map1.put('.', "010001");
    map1.put('?', "000001");
    map1.put('A', "100101");
    map1.put('B', "10011010");
    map1.put('C', "0101");
    map1.put('D', "0001");
    map1.put('E', "110");
    map1.put('F', "01001");
    map1.put('G', "10011011");
    map1.put('H', "010000");
    map1.put('I', "0111");
    map1.put('J', "10011000");
    map1.put('K', "0110");
    map1.put('L', "00100");
    map1.put('M', "10011001");
    map1.put('N', "10011110");
    map1.put('O', "00101");
    map1.put('P', "111");
    map1.put('Q', "10011111");
    map1.put('R', "1000");
    map1.put('S', "00110");
    map1.put('T', "00111");
    map1.put('U', "10011100");
    map1.put('V', "10011101");
    map1.put('W', "000010");
    map1.put('X', "10010010");
    map1.put('Y', "10010011");
    map1.put('Z', "10010000");
  }

  static HashMap<String, Character> map2 = new HashMap<>();
  static {
    map2.put("00000", 'A');
    map2.put("00001", 'B');
    map2.put("00010", 'C');
    map2.put("00011", 'D');
    map2.put("00100", 'E');
    map2.put("00101", 'F');
    map2.put("00110", 'G');
    map2.put("00111", 'H');
    map2.put("01000", 'I');
    map2.put("01001", 'J');
    map2.put("01010", 'K');
    map2.put("01011", 'L');
    map2.put("01100", 'M');
    map2.put("01101", 'N');
    map2.put("01110", 'O');
    map2.put("01111", 'P');
    map2.put("10000", 'Q');
    map2.put("10001", 'R');
    map2.put("10010", 'S');
    map2.put("10011", 'T');
    map2.put("10100", 'U');
    map2.put("10101", 'V');
    map2.put("10110", 'W');
    map2.put("10111", 'X');
    map2.put("11000", 'Y');
    map2.put("11001", 'Z');
    map2.put("11010", ' ');
    map2.put("11011", '.');
    map2.put("11100", ',');
    map2.put("11101", '-');
    map2.put("11110", '\'');
    map2.put("11111", '?');
  }

  public static void main(String[] args) {
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < line.length(); i++) {
        builder.append(map1.get(line.charAt(i)));
      }
      for (int i = builder.length(); i % 5 != 0; i++) {
        builder.append('0');
      }
      line = builder.toString();
      builder.setLength(0);
      for (int i = 5; i <= line.length(); i += 5) {
        builder.append(map2.get(line.substring(i - 5, i)));
      }
      System.out.println(builder.toString());
    }
  }
}
