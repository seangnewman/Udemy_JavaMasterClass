public class NumberToWords {
   public static int getDigitCount(int number) {
    if(number < 0)
      return -1;   
    int i = 0;
    
    do{
        i++; 
       number /= 10;
    }while( number > 0);
    return i;
   }

   public static int reverse(int number){
      int tempNumber = Math.abs(number);  
      int reverse = 0;

      do
      {
        reverse = (reverse* 10) +tempNumber % 10;
        tempNumber /= 10;
      }while(tempNumber > 0);
    
      return number < 0 ? -reverse: reverse;
   }
   public static void numberToWords(int number){
       if(number < 0)
         System.out.println("Invalid Value");
        
        int tempNumber = reverse(number);
        int wordCount = getDigitCount(number);
        String stringNumber = "";
        for(int i=1; i <= wordCount; i++)
        {
            int thisDigit = tempNumber % 10;
            switch(thisDigit)
              {
                case 0:
                  stringNumber += "Zero "; 
                  break;
                case 1:
                  stringNumber +=  "One ";
                  break; 
                case 2:
                  stringNumber +=  "Two ";
                  break;
                case 3:
                  stringNumber +=  "Three ";
                  break; 
                case 4:
                  stringNumber +=  "Four ";
                  break; 
                case 5:
                  stringNumber +=  "Five ";
                  break; 
                case 6:
                  stringNumber +=  "Six ";
                  break; 
                case 7:
                  stringNumber +=  "Seven ";
                  break; 
                case 8:
                  stringNumber +=  "Eight ";
                  break; 
                case 9:
                  stringNumber +=  "Nine ";
                  break; 
                default:
                  break;

              } 
              tempNumber /= 10;
        
        }
        System.out.println(stringNumber);
   }

}
