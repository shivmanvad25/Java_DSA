//Program to calculate the max sum of any sub array of size k.

import java.util.Scanner;

public class Arr36_LongestSubArray {
    public static int maxSubarraySum(int[] arr,int k){

        int n= arr.length;
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        int maxsum = sum;
        for(int i=k; i<n; i++){
            sum +=arr[i]-arr[i-k];
            maxsum= Math.max(maxsum, sum);

        }
        return maxsum;



    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println("Enter the value of k = ");
        int k = sc.nextInt();
        sc.close();


        System.out.printf("Max sum of subarray of size %d : %d \n",k,maxSubarraySum(arr, k));

    }
    
}
