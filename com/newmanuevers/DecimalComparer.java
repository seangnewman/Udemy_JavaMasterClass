package newmanuevers;

public class DecimalComparer {
  public static boolean AreEqualByThreeDecimalPlaces(double num1, double num2){
      return ((int)(num1 * 1000) == (int)(num2 * 1000)) ? true : false;
  } 
}
