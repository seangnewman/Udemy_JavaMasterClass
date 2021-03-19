public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<= 1)
          return false;
        int i = 1;
        int accum = 0;    
        do{
         if( number % i == 0)
           accum += i;
          i++;
        }while(i < number);

        return accum == number ? true : false;

    }
}
