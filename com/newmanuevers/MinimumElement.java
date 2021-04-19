import java.util.Scanner;

public class MinimumElement {
    private static int readInteger(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of integers for input: ");
        int size =  input.nextInt();
        input.nextLine();
        //input.close();
        return size;

    }

    private static int[] readElements(int size){
        int count = 0;
        int[] newArray = new int[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter " + size + "numbers on separate lines");

        while( count < size){
            System.out.print("Enter element[" + (count + 1) + "]: ");
            newArray[count] = scanner.nextInt();
            count++;
        }
        scanner.close();
        return newArray;

    }

    private static int FindMin(int[] inputArray){
        int minValue = inputArray[inputArray.length -1 ];
        for( int i = 0; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }

        return minValue;
    }
}
