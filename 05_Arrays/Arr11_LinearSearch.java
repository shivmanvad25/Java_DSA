import java.util.Scanner;

public class Arr11_LinearSearch {
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



        int index = -1;
        for (int i=0 ; i< arr.length; i++) {

            if(arr[i] == key)
            {
                index = i;
                break;
            }
        
            
        }
        if(index!=-1)
        {
            System.out.printf("Element %d is found at index %d.", key, index);
        }
        else{
            System.out.println("Element not found.");
        }

        sc.close();


    }
    
}
