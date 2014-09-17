import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    String[] words = scan.nextLine().split(" ");
    int maxLen = 0;
    String maxLenWord = "";
    Map<String, Integer> dict = new HashMap<String, Integer>();
    for (String word : words) {
      int count = 0;
      if (dict.containsKey(word)) {
        count = dict.get(word);
      }
      count += 1;
      dict.put(word, count);

      if (maxLen < word.length()) {
        maxLen = word.length();
        maxLenWord = word;
      }
    }

    int maxCount = 0;
    String maxCountWord = "";
    for (String word : dict.keySet()) {
      int count = dict.get(word);
      if (maxCount < count) {
        maxCount = count;
        maxCountWord = word;
      }
    }

    System.out.printf("%s %s\n", maxCountWord, maxLenWord);
  }
}
