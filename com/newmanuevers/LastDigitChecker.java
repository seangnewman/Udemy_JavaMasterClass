public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3) )
          return false;
        int ld1 = num1 % 10;
        int ld2 = num2 % 10;
        int ld3 = num3 % 10;

        return ((ld1 == ld2) || (ld1==ld3) ) || (ld2==ld3) ? true : false;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000)
          return false;
        return true;
    }
}
