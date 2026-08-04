//Direct application of binary search
//always dry run the code fully before making judgements

//ceiling number is the smallest num which is equal to or greater than the target element.


public class Arr50_CeilingNumber {
    public static void main(String[] args) {
        
        int [] arr = { 2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceilingNum(arr, 8));

    }

    static int ceilingNum(int[] arr, int target){

        //imp edge case if target is greater than the array elements
        if(target>arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){   
            int mid= start + (end -start)/2;

            if(target< arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return arr[mid];
            }
            
           
        }
        return arr[start];
        }

    }
    

