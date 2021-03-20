import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        boolean validInput = false;
        int accumulator = 0;
        int numberOfInputs = 0;

        Scanner scanner = new Scanner(System.in);
        do{
            //System.out.print((numberOfInputs + 1) + ": ");
            System.out.println();
            validInput = scanner.hasNextInt();
            if(validInput){
                accumulator += scanner.nextInt();
                scanner.nextLine();
                numberOfInputs++;
            }

        }while(validInput);
        scanner.close();
        if(numberOfInputs > 0)
          System.out.println("SUM = " + accumulator + " AVG = " + Math.round((double)accumulator/numberOfInputs));
        else
          System.out.println("SUM = 0 AVG = 0");
        
    }
    
}
