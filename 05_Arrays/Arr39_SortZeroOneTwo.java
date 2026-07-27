//Program to sort zero, one and two.
//Brute force


public class Arr39_SortZeroOneTwo {
    public static void sortZeroOneTwo(int[] nums) {

        int count0= 0;
        int count1 = 0;
        int count2 = 0;

        for(int element: nums){
            if(element==0){
                count0++;
            }
            else if (element==1){
                count1++;
            }
            else{
                count2++;
            }
        }
            int i=0;
            for(int j=0; j<count0; j++){
                nums[i++]=0;
                
            }        
            for(int j=0; j<count1; j++){
                nums[i++]=1;
                
            }         
            for(int j=0; j<count2; j++){
                nums[i++]=2;

            }

            
        for(int element: nums){
            System.out.print(element+",");
        }


        
    }
    public static void main(String[] args) {
         int[] arr = {1, 0, 2, 1, 0};

         sortZeroOneTwo(arr);
    }

}
    

