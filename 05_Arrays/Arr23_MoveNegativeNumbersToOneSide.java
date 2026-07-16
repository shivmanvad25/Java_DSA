//Program to move negative numbers to one side.

//more optimal solution by two pointer technique.

public class Arr23_MoveNegativeNumbersToOneSide {
    public static void main(String[] args) {

        int[] arr ={-3, 6, 8, -9, -5, 1, 2};

        System.out.println("Original Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
            
        }

        int temp[]=new int[arr.length];
        int j=0;
           
        //to store negatives
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            { 
                temp[j]=arr[i];
                j++;           
            }
        }

        //to store positives
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0)
            { 
                temp[j]=arr[i];
                j++;
            }
        }


        System.out.println("\nArray after moving negatives to one side:");
        for (int element : temp) {
            System.out.print(element+ " ");
            
        }
        
    }
}

//Space complexity = O(n);
//Time complexity = Big O notation - O(n);
