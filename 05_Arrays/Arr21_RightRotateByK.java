//Program to right rotate array by k.

//there is more optimal solution than this one we will learn later.

import java.util.Scanner;

public class Arr21_RightRotateByK {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        
        int[] arr = {10, 90, 70, 60, 80, 50};

        System.out.println("Enter no of rotation to right: ");
        int k = sc.nextInt();

        k = k % arr.length; //for optimsation.

        System.out.println("Original Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }


        int lastk[] = new int[k];
        for(int i=0; i<k; i++)
        {
            lastk[i]= arr[arr.length-k+i];
        }
        for(int i=arr.length-k-1; i>=0; i--)
        {
            arr[i+k]=arr[i];
        }
        for(int i=0; i<k; i++)
        {
            arr[i]=lastk[i];

        }

        System.out.println("\nArray after k rotation to right is: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }

        sc.close();
}
    
}
