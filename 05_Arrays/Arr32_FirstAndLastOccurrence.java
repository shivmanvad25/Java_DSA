//Program to find first and last occurance of the element.

import java.util.Scanner;

public class Arr32_FirstAndLastOccurrence {

    public static int[] firstlast(int[]arr, int key){

        int first=-1;
        int last=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                if(first==-1){
                first=i; 
                }
                last=i;   
            }            
        
        }

        return new int[]{first, last};
        

        
        
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int[] brr = { 1, 2, 3, 4, 2, 4, 5, 2};

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();
        int[] ans = firstlast(brr, target);

        System.out.println("First occurance of an element: "+ans[0]);
        System.out.println("Last occurance of an element: "+ans[1]);
        
        
    }
    
}

//Time complexity - O(n)
//Space complexity - O(1)
//Pattern- Linear Traversal + State Tracking
