/*
 * Name: Benjamin Lumber
 * Student number:
 */


public class DaysofWeek{
  public static void main(String[] args) {


    
    System.out.println(dayOfWeek(14, 8, 1947));
    System.out.println(dayOfWeek(1, 1, 2000));

  }

  public static String dayOfWeek(SimpleDate date) {


    
    int y = getYear();
    int d = getDay();
    int m = getMonth();

    if (m < 3) {
      m = m + 10;
      y--;
    } else m = m - 2;

    int D = y % 100;
    int C = y / 100;

    int W = (13*m-1)/5;

    int X = D/4;
    int Y = C/4;


    int Z = d + W + D + X + Y - 2*C;
    Z = Z < 0 ? negHandler(Z) : Z % 7;

    switch (Z) {
      case 0: return "SUNDAY";
      case 1: return "MONDAY";
      case 2: return "TUESDAY";
      case 3: return "WEDNESDAY";
      case 4: return "THURSDAY";
      case 5: return "FRIDAY";
      case 6: return "SATURDAY";
      default: return "CALCULATION FAILED";
    }
  }

  public static int negHandler(int Z) {
    int i = 0;
    while (i > Z)
      i -= 7;
    return Z - i;
  }





}
