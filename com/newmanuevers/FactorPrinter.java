public class FactorPrinter {
  public static void printFactors(int number){
    if(number < 0)
    {
      System.out.println("Invalid Value");
    }
    else
    { 
      String factors = "";
      int tempNumber = number;
      int i = 1;
      do
      {
       if( tempNumber % i == 0)
         factors += i + " "; 
       i++;
      }while (i <= tempNumber);
    
      System.out.println(factors);
    }
  }  
}
