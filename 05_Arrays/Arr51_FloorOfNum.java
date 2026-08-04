//floor of num is greatest num which is equal to or smaller than the target number.

public class Arr51_FloorOfNum {

    public static void main(String[] args) {
        int[] arr ={2, 3, 5, 9, 14, 16, 18};
        System.out.println(floorNum(arr, 10));

    }

    static int floorNum(int[] arr, int target){

         if(target<arr[0]){
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
        return arr[end];
        }
    }
    

