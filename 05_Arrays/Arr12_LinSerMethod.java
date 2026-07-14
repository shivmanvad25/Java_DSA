import java.util.Scanner;

public class Arr12_LinSerMethod{

    static int linearSearch(int arr[] , int key){

        for(int i=0; i<arr.length; i++){

            if(arr[i]==key)
            {
               return i;
            
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        for (int i=0 ; i< arr.length; i++) {

            System.out.print("Enter element at index "+ i + ": ");
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the searching element:  ");
        int key = sc.nextInt();

        int search = linearSearch(arr , key);

        if(search != -1)
        {
            System.out.printf("Element %d is found at index %d.", key, search);

        }
        else
        {
            System.out.print("Element not found. ");
        }




        sc.close();
        

    }

}
