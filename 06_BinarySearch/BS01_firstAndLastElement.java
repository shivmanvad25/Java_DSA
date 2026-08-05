import java.util.Arrays;

public class BS01_firstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {  5, 7, 7, 8, 8, 10};

        int first = firstoccur(arr, 10);
        int last = lastoccur(arr, 10);

        int[] brr = {first, last};
      System.out.println(Arrays.toString(brr));
    }

    static int firstoccur(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int ans =-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target==arr[mid]){
                ans=mid;
                end = mid-1;

            }
             else if(target<arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            
        }
        return ans;
    }
    static int lastoccur(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int ans =-1;

        while(start<=end){

            int mid = start + (end-start)/2;

            if(target==arr[mid]){
                ans=mid;
                start = mid+1;

            }
             else if(target<arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
            
        }
        return ans;
    }
    
}
