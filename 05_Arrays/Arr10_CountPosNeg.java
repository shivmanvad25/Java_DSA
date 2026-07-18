//Program to count positive and negative elements of array.

import java.util.Scanner;

public class Arr10_CountPosNeg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int countPos = 0;
        int countNeg = 0;
        int zero = 0;

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();

            if(arr[i] == 0)
            {
                zero++;
            }
             else if(arr[i]>0)
            {
               countPos++;
            }
            else
            {
                countNeg++;
            }
        }
        System.out.println("Positive elements: " +countPos );
        System.out.println("Negative elements: " +countNeg );
        System.out.println("Zeros: " +zero );

        sc.close();
    }
    
}
// Pattern Used:
// Frequency Counting