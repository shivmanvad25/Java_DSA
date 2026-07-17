//Program to remove duplicate elements.

public class Arr27_RemoveDuplicatesFromSortedArray {

    public static int removeduplicate(int[] arr){

        int j=0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
            

        }
        return j+1;
    }
    public static void main(String[] args) {
        
        int[] brr={1, 1, 3, 3, 4, 5};

        int duplicate = removeduplicate(brr);
        System.out.println("Array after moving zeroes to end");
        for (int i = 0; i < duplicate; i++) {
            System.out.print(brr[i] + " ");
            
        }
    }
    
}
