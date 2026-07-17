//Program to remove a specicic element.

import java.util.Scanner;

public class Arr28_RemoveElement {

    public static int removeelement(int[] arr, int k){

        int j=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=k){
                
                arr[j]=arr[i];
                j++;
            }

        }
        return j;


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] brr = {1, 2, 2, 3, 5, 2, 6};

        System.out.println("Enter element to be removed: ");
        int a = sc.nextInt();

        System.out.println("Original Array: ");
        for (int element : brr) {
            System.out.print(element+ " ");
            
        }


        System.out.printf("\nArray after removing %d :\n",a);

        int duplicate = removeelement(brr, a);
        
        for (int i = 0; i < duplicate; i++) {
            System.out.print(brr[i] + " ");
            
        }
    }
    
}
