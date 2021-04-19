import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    
    public int[] getIntegers(int size){

        Scanner input = new Scanner(System.in);
        int[] inputArray = new int[size];
        int count = 0;
        System.out.println("Please enter " + size + " integers for sorting");

        while( count < size){
            System.out.println("Integer " + (count + 1) + ": ");
            inputArray[count] = input.nextInt();
            count++;
            

        }

        input.close();
        return inputArray;
    }

    public void printArray(int[] printArray){
        for(int i = 0; i < printArray.length; i++){
            System.out.println("Element " + i + " contents " + printArray[i]);
        }

    }

    public int[] sortIntegers(int[] originalArray){
        int[] sortedArray = Arrays.copyOf(originalArray, originalArray.length);
        int swap = sortedArray[sortedArray.length - 1];
        for(int i=0; i < sortedArray.length -1 ; i++){
            for( int j=0; j < sortedArray.length - 1; j++){
                if( sortedArray[j] < sortedArray[j + 1]){
                    swap = sortedArray[j];
                    sortedArray[j] = sortedArray[j+1];
                    sortedArray[j+1] = swap;

                }
            }
        }

        return sortedArray;
    }
    
}
