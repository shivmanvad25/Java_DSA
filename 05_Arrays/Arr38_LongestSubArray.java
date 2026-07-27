//Program to find longest subarray with given sum.

public class Arr38_LongestSubArray {


    public static int longestsubarray(int[] arr, int key){
        
        int length =0;
        for(int i=0; i<arr.length; i++){
               int sum =0;
            for(int j=i; j<arr.length; j++){
                    sum+=arr[j];
                    if(sum==key){
                        length = Math.max(length, j-i+1 );
                    }
            }
        }
               return length;     


    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};

        int ans = longestsubarray(arr, 15);
        System.out.println("Length of longest subarray is: " +ans);
    }
    
}
