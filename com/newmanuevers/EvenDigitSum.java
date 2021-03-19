public class EvenDigitSum {
   public static int getEvenDigitSum(int number){
    if(number < 0 )
      return -1;

    int tempNumber = number;
    int accum = 0;
    
    int currentDigit = 0;
    do
    {
      currentDigit = tempNumber % 10; 
      if(currentDigit % 2 == 0)
        accum += currentDigit;
      tempNumber /= 10;  
 
    }while(tempNumber > 0);

    return accum;

   } 
}
