//Program to check if the Array is sorted or not.

import java.util.Scanner;

public class Arr24_IsSorted {

    public static boolean isSorted(int[] arr) {
    // return true if array is sorted in increasing order
    for(int i=0; i<arr.length-1; i++){
    if(arr[i]>arr[i+1]){

        return false;
    }
    
    }
    return true;
}
    public static void main(String[] args) {
        
        int[] brr = new int[6];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<brr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            brr[i] = sc.nextInt();
        }
       

       if(isSorted( brr)==true)
       {
        System.out.println("Array is sorted");
       }
       else
       {
        System.out.println("Array is not sorted.");
       }
        


        sc.close();
    }
    
}
