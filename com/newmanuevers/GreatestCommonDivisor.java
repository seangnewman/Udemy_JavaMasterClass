public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2)
    {
        if(num1 < 10 || num2 < 10)
          return -1;
        if( num1 == num2)
          return num1;

        int largerNumber = num1 >= num2 ? num1 : num2;
       
         
        do
        {
          if(num1 % largerNumber == 0  && num2 % largerNumber == 0)
            return largerNumber;
            
           largerNumber--;

        }while(largerNumber > 0);

        return largerNumber;
    }
}
