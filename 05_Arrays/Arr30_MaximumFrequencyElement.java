//Program to find max frequency element.

import java.util.Scanner;

public class Arr30_MaximumFrequencyElement {

    public static int maxfrequency(int[] arr){

        int max = 0;
        int store = 0;
        
        for(int i=0; i<arr.length; i++){

            int count=0;
            for(int j=0; j<arr.length; j++){

                if(arr[i]==arr[j]){
                    count++;
                    
                }   
                
            }
            if(max<count){
                    max = count;
                    store = arr[i];

                }
        }
        return store;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] brr = new int[n];

        for(int i=0; i<brr.length; i++)
        {
            System.out.print("Enter element at index "+ i + ": ");
            brr[i] = sc.nextInt();

        }

        System.out.println("Maximim frequency element is:" +maxfrequency(brr));
    }
    
}

//Pattern - frequency counting
