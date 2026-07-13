// Program to calculate maximum element of array.

import java.util.Scanner;

public class Arr06_MaxElement {

    public static void main(String[] args) {
        

        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
 
        
        for(int i =0; i<arr.length; i++){
            System.out.println("Enter element at index "+ i + ":");
            arr[i]= sc.nextInt();
        }


        int max = arr[0];
        for(int element: arr)
        {
            if(max<element)
            {
                max = element;
            }

        }
        System.out.println("Maximum element of array is : "+max);

        sc.close();
    }
}