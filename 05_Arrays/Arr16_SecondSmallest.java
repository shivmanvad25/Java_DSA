//Program to find second smallest element.

import java.util.Scanner;

public class Arr16_SecondSmallest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();
        }

        int smallest = arr[0];
        int secsmallest = Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<smallest){
                secsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secsmallest && arr[i]>smallest)
            {
                secsmallest = arr[i];
            }

        }

        System.out.println("Smallest element: "+smallest);
        System.out.println("Second smallest element: "+secsmallest);

    }
    
}
