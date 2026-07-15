//Program to find sec largest element.

// here array does not contain negative elements.

import java.util.Scanner;

public class Arr15_SecondLargest {

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

        int largest = arr[0];
        int seclargest = -1; // or Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(largest<arr[i]){
                seclargest = largest;
                largest = arr[i];

            }

            else if(arr[i]>seclargest && largest >arr[i]){
                seclargest = arr[i];

            }
        }

    

        System.out.println("Largest element:"+largest);
        System.out.println("Second largest element:"+seclargest);
        



            
             


    }
    
}
