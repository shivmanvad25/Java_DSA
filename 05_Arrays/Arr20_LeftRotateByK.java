//Program to left rotate array by k.

//there is more optimal solution than this one we will learn later.

import java.util.Scanner;

public class Arr20_LeftRotateByK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arr = {10, 90, 70, 60, 80, 50};

        System.out.println("Enter no of rotation to left side: ");
        int k = sc.nextInt();

        k = k % arr.length; //for optimsation.

        System.out.println("Original Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }
        

        int temp[]=new int[k];
        for(int i=0; i<k; i++)
        {
             temp[i] = arr[i];
        }
        for(int i=0; i<arr.length-k; i++)
        {
            arr[i]= arr[i+k];
        }
        for(int i=0; i<k; i++)
        {
              arr[arr.length-k+i]=temp[i];
        }

        System.out.println("\nArray after k rotation to left is: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }

        






        sc.close();


    }
    
}
