package newmanuevers;

public class TeenNumberChecker {
  public static boolean hasTeen(int num1, int num2, int num3){
    return ( isTeen(num1) || isTeen(num2) || isTeen(num3)) ? true : false;
  }

  public static boolean isTeen(int num){
      return num >= 13 && num <= 19 ? true : false;
  }
}
