//Optimal approach

public class Arr40_DutchFlagAlgo {

    public static void sortZeroOneTwo(int[] nums) {


        int n = nums.length;
        int low=0, mid=0, high= n-1;

        while(mid<=high){

            if(nums[mid]==0){
                swap(nums,low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high, mid);

                high--;
                
            }
        }
        for (int element : nums) {
            System.out.print(element+",");
            
        }


    }
    static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
public static void main(String[] args) {
    
    int arr[]={2, 0, 0, 1, 1, 0};
    sortZeroOneTwo(arr);
}

}
