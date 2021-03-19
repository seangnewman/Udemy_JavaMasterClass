public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if( num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99)
          return false;
        // This limits the numbers to 2 digits...
        int nd1 = num1 % 10;  // first digit in num1
        int nd2 = num1 / 10;  // second digit in num1
        int sd1 = num2 % 10;  // first digit in num2   
        int sd2 = num2 / 10;  // second digt in num2 
        
        return (nd1 == sd1 || nd1 == sd2) || (nd2 == sd1 ) || (nd2 == sd2) ? true : false;
    }
}
