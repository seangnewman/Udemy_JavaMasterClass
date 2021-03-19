public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        
        int tempNumber = Math.abs(number);  
        if(tempNumber < 10)
          return false;
       
        int reverse = 0;
 
        do
        {
            reverse = (reverse* 10) +tempNumber % 10;
            tempNumber /= 10;
        }while(tempNumber > 0);
        
        return Math.abs(number) == reverse? true : false;

        
    }
}
