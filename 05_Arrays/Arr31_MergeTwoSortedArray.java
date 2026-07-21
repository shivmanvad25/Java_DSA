//Program to merge two sorted array using another array.


import java.util.Scanner;

public class Arr31_MergeTwoSortedArray {
    public static int[] mergearray(int[] arr, int[] brr){
        int[] crr = new int[arr.length+brr.length];
        int k=0;
        int j=0;
        int i=0;
        while(i<arr.length && j<brr.length){
            if(arr[i]>=brr[j]){
                crr[k]=brr[j];
                j++;
                
                
            }
            else if (arr[i]<= brr[j]){
                crr[k] = arr[i];
                i++;
            }
            
            k++;
        }
        while(i<arr.length){
            crr[k]=arr[i];
            k++;
            i++;
        }
        while(j<brr.length){
            crr[k]=brr[j];
            k++;
            j++;
        }

        


        return crr;
    }
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter array size: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter first sorted array:");
    for(int i=0; i<arr.length; i++)
    {
        System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();
    }
    System.out.println("Enter array size: ");
    int m= sc.nextInt();
    int[] brr = new int[m];
    System.out.println("Enter second sorted array:");
    for(int i=0; i<brr.length; i++)
    {
        System.out.print("Enter element at index "+ i + ": ");
            brr[i] = sc.nextInt();
    }

    System.out.println("merge sorted array is: ");
    int[] ans = mergearray(arr, brr);

    for(int x : ans){
    System.out.print(x + " ");
    }


    sc.close();

   }

    
}

//Time Complexity- O(n+m)
//Space Complexity- O(n+m)