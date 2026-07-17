//Program to check palindrome array.

import java.util.Scanner;

public class Arr25_CheckPalindromeArray {

    public static boolean palindrome(int[] arr){

        int left =0;
        int right = arr.length-1;

        while(left<right){

            if(arr[left]!=arr[right]){
                return false;
            }       
            left++;
            right--;
        
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] brr = new int[7];

        for(int i=0; i<brr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            brr[i] = sc.nextInt();
        }

        if(palindrome(brr)==true)
        {
            System.out.println("Array is palindrome.");
        }
        else{
            System.out.println("Array is not palindrome.");
        }

    }
}
