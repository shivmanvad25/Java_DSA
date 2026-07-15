//Program to rotate array right by one

public class Arr19_RightRotateByOne {
    public static void main(String[] args) {
        
    int[] arr = {30, 50, 70, 40, 90};

    System.out.println("Original array:");
        for (int element : arr) {
            System.out.print(element + " ");
            
        }


        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
        {
            arr[i]=arr[i-1];      

        }
        arr[0] = temp;

        System.out.println("\nAfter right rotate by one:");
        for (int element : arr) {
            System.out.print(element + " ");
            
        }
         
    }

    
}
