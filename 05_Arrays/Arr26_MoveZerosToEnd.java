//Move zeroes to end by two pointers.

public class Arr26_MoveZerosToEnd {

    public static int[] movezeroes(int[] arr){

        int j=0;// keeps track of all the zeroes
        for(int i=0; i<arr.length; i++)
        {
        if(arr[i] != 0)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            j++;

        }
        
        }
        return arr;
    }
    public static void main(String[] args) {
        
        int[] brr = {10, 0, 30, 40, 0, 0, 60};

        int zero[] = movezeroes(brr);

        System.out.println("Array after moving zeroes to end");
        for (int element : zero) {
            System.out.print(element + " ");
            
        }
    }
    
}
