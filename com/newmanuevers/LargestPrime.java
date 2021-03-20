public class LargestPrime {
    public static int getLargestPrime(int number){
      if(number < 1)
        return -1;
        
      int largestPrime = -1;
      int tempNumber = number;

      for(largestPrime = 2; largestPrime <= tempNumber; largestPrime++){
            if(tempNumber % largestPrime == 0){
                tempNumber /= largestPrime;
                largestPrime--;

            }
               
      }
      System.out.println(largestPrime);
      return largestPrime ;

    }
}
