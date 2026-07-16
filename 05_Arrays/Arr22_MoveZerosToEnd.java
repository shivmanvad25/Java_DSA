//Program to move zeros to end.

//There is more optimal solution for this. We can swap in the same array

public class Arr22_MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr ={10, 0 ,60, 0, 0, 90, 60, 70};
        
        System.out.println("Original Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }

        int temp[]= new int[arr.length];
        int j=0;
        for(int i=0; i<arr.length; i++ )
        {
            
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;

            }

        

        }
        System.out.println("\nAfter moving arrrays to the zeroes:");
        for(int i=0; i<temp.length; i++)
        {
            System.out.print(temp[i]+ " " );

        }

        
    }
    
}

//Space complexity = O(n);
//Time complexity = O(n);
