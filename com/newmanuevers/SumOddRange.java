public class SumOddRange {
    public static boolean isOdd(int number){
        if(number < 0)
          return false;

        return number % 2 == 0? false: true;
    }

    public static int sumOdd(int start, int end){
        int sumOfNumbers = 0;
        
        if(start < 0 || end < 0|| start > end)
          return -1;

        for (int i = start; i <= end; i++) {
           if( isOdd(i))
             sumOfNumbers += i; 
        }
        return sumOfNumbers;

    }
}
