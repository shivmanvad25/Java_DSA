//Program to reverse the array.
//This is optimal solution using two pointers.

public class Arr24_ReverseArray {

    public static int[] reverse(int[] arr)
    {
        int left = 0;
        int right = arr.length-1; 

        while(left<right){

           int temp = arr[left];
           arr[left] = arr[right];
           arr[right]= temp;
           left++;
           right--;

        }
        return arr;   
    }


    public static void main(String[] args) {

        int[] brr = {1, 5, 7, 9, 5, 4};

        System.out.println("Original array: ");
        for (int element : brr) {
            System.out.print(element + " ");
            
        }

        System.out.println("\nReversed array: ");
        int reversed[] = reverse(brr);
        
            for(int i=0; i<brr.length; i++){


                System.out.print(reversed[i] + " ");
            }
        

        }
                    
    }
    
 //Space complexity = O(1);
 //Time complexity =  O(n);

