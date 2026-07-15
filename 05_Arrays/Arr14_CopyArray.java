//Program to copy array.

// Beginner way without built in function.

import java.util.Scanner;

public class Arr14_CopyArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] copy = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();
            copy[i] = arr[i];
        }


        //Original array
        System.out.println("Original array is:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");

        }

        //Copied array
        System.out.println("\nCopied array is:");
        for(int i=0; i<copy.length; i++)
        {
            System.out.print(copy[i]+ " ");

        }



        
    }
    
}
