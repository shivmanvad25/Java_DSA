//Program to count even and odd elements in array.

import java.util.Scanner;

public class Arr08_CountEvenOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //Take array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        if(size > 0)
        {
            //Take input from array and count simultaneously
            int[] arr = new int[size];

            int countEven = 0;
            int countOdd = 0;

            for(int i=0; i<arr.length; i++)
            {
                System.out.print("Enter element at index "+ i + ": ");
                arr[i] = sc.nextInt();
                if(arr[i]%2 == 0)
                    countEven++;
                else
                    countOdd++;

            }
            System.out.println("Number of EVEN elements: "+countEven);
            System.out.println("Number of ODD elements: "+countOdd);
        }
        else
            System.out.println("Invalid Array Size.");
        
    }
    
}


//Time Complexity: 0(n)
//Space Complexity: 0(1)