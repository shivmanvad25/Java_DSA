//Program to count occuranace of an element in array.

import java.util.Scanner;

public class Arr13_CountOccurance {
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

        System.out.println("Enter key element: ");
        int key = sc.nextInt();

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                count++;
            }
        }

        System.out.printf("Element %d occurs %d times.",key ,count);

        
    }
    
}

// Pattern Used:
// Frequency Counting