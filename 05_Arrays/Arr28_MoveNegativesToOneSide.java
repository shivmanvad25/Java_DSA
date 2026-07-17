//Program to move negative numbers to one side in optimal way.

public class Arr28_MoveNegativesToOneSide {

    public static int[] movenegatives(int[]arr){

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j++;

            }
        }


        return arr;

    }
    public static void main(String[] args) {
        
        int[] brr={1, -4, -6, -7, 8, 3, 2};

        int zero[] = movenegatives(brr);

        System.out.println("Array after moving zeroes to end");
        for (int element : zero) {
            System.out.print(element + " ");
            
        }

        
    }
}
