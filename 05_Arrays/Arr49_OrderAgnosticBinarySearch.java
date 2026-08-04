//order agnostic binary search 
// when we dont know the order of sorting it could be ascending or decending.

public class Arr49_OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {18, 12, 11, 9, 8, 6, 4};
        System.out.println(binarySearch2(arr, 9));
        
        
    }
    public static int binarySearch2(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
        int first = arr[start];
        int last = arr[end];

        while(start<=end)     
       {
        int mid = start + (end-start)/2;
        // int mid = (start + end)/2;// when end and start are to large start+end might exceede the int range
        if(target==arr[mid]){
            return mid;
        }
        if(first<last)
        {  
            
            if(target< arr[mid]){
                end = mid-1;
            }
            else 
                start = mid+1;
            }
        else{

            if(target> arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }     
        }
    }
    return -1;
    }
    }
    

    


