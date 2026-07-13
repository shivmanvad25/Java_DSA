//Program to find minimum element of an array.

import java.util.Scanner;

public class Arr07_MinElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Take array size from user.
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        if(size > 0)
        {

        // Take input from user
        int[] arr = new int[size];

        System.out.print("Enter element at index 0: ");
        arr[0]= sc.nextInt();
        int min = arr[0];

        for(int i =1; i<arr.length; i++){
            System.out.print("Enter element at index "+ i + ":");
            arr[i]= sc.nextInt();
            
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
    
         System.out.println("Minimum element of array is : "+min);
    }
    else
    {
        System.out.println("Invalid Array Size.");
    }

        sc.close();
        
    }
    
}
