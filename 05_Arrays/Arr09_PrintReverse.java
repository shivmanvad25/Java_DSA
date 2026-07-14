// Program to print array in reversed order.

public class Arr09_PrintReverse {

    public static void main(String[] args) {

        int[] arr = {10, 34, 67, 90, 101};

        //Print original array 
        System.out.print("Original Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }

        //Printing in reversed order

        System.out.print("\nReversed Array: ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+ " ");
            
        }
        System.out.println();
        
    }
}

//Time Complexity: 0(n)
//Space Complexity: 0(1)