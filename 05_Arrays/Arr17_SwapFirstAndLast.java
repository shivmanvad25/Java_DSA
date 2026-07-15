//Program to swap first and last element.

import java.util.Scanner;

public class Arr17_SwapFirstAndLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        if (n <= 0) {
        System.out.println("Invalid size");
        return;
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int element : arr) {
            System.out.print(element + " ");
            
        }

        
          // swapping first and last
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;

            System.out.println("\nAfter swapping:");
            for (int element : arr) {
                System.out.print(element + " ");
                
            }

        sc.close();     
    }
    
}
