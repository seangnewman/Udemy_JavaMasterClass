public class ReverseArray {
    private static void reverse(int[] intArray){
        System.out.print("Array = [");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i]);
            if(i != intArray.length -1){
                System.out.print(", ");
            }else{
                System.out.println("]");
            }
        }

        int swap = 0;
        int count = 0;
        while(count <  intArray.length /2){
            swap = intArray[count];
            intArray[count] = intArray[(intArray.length-1) - count];
            intArray[(intArray.length-1) - count] = swap;
            count++;
        }

        System.out.print("Reversed Array = [");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i]);
            if(i != intArray.length -1){
                System.out.print(", ");
            }else{
                System.out.println("]");
            }
        }


    }
}
