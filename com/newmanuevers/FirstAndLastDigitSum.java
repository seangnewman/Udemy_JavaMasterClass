public class FirstAndLastDigitSum {
   public static int sumFirstAndLastDigit(int number){
    if(number < 0 )
      return -1;

    int tempNumber = number;
    int firstDigit = tempNumber % 10;
    int lastDigit = 0;
      
    do{
      lastDigit = tempNumber;
      tempNumber /= 10;
    }while(tempNumber > 0);

    return firstDigit + lastDigit;
   } 
}
