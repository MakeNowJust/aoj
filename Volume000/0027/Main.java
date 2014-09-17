import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class Main {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    for (;;) {
      int month = scan.nextInt();
      int day = scan.nextInt();
      if (month == 0) break;
      
      Calendar cal = Calendar.getInstance();
      cal.set(Calendar.YEAR, 2004);
      cal.set(Calendar.MONTH, month - 1);
      cal.set(Calendar.DAY_OF_MONTH, day);

      System.out.println(weekDayToString(cal.get(Calendar.DAY_OF_WEEK))); 
    }
  }

  public static String weekDayToString(int weekDay) {
    switch (weekDay) {
    case Calendar.MONDAY:
      return "Monday";
    case Calendar.TUESDAY:
      return "Tuesday";
    case Calendar.WEDNESDAY:
      return "Wednesday";
    case Calendar.THURSDAY:
      return "Thursday";
    case Calendar.FRIDAY:
      return "Friday";
    case Calendar.SATURDAY:
      return "Saturday";
    case Calendar.SUNDAY:
      return "Sunday";
    default:
      return "";
    }
  }
}
