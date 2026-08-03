//Binary search

public class Arr47_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-2, -4, 0, 6, 9, 11, 12, 14, 20};

        System.out.println(binarySearch(arr, 20));
        
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            // int mid = (start + end)/2;// when end and start are to large start+end might exceede the int range.

            int mid = start + (end-start)/2;

            if(target< arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;



    }
   
    
}

//Worst case time complexity: O(logN)
