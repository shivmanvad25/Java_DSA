//Program to rotate array left by one.

public class Arr18_LeftRotateByOne {
    public static void main(String[] args) {

        int[] arr = {10, 30, 40, 50, 60};
        
        System.out.println("Original array:");
        for (int element : arr) {
            System.out.print(element + " ");
            
        }


        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++)
        {
            arr[i]=arr[i+1];      

        }
        arr[arr.length-1] = temp;

        System.out.println("\nAfter left rotate by one:");
        for (int element : arr) {
            System.out.print(element + " ");
            
        }
         
        
    }
    

    
    
}
