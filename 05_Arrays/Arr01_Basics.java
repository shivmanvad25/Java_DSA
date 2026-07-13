import java.util.Scanner;

public class Arr01_Basics {
    public static void main(String[] args) {


        // //declaration
        // int arr[];

        // //allocation

        // arr = new int[6]; //will take total 24 bytes as 1 int take 4 bytes


        // //initialisation

        // int brr[] = {10, 20, 30,};

        // //ACCESS ELEMENTS OF ARRAY
        
        //  System.out.println("Value at 2 index = " + brr[2]);
        //  System.out.println("Value at 1 index = " + brr[1]);


        // //BY LOOPS

        // int n = brr.length; //use to store length of array

        // for(int i =0; i<=n-1; i++)
        // {
        //      System.out.println(brr[i]);
        //  }

        // // FOR EACH LOOP

        //  for(int val: brr)
        // {
        //     System.out.println(val);
        //  }

     //INPUT
     Scanner sc = new Scanner(System.in);

        int arr[]= new int[3];


        int n = arr.length;

        //input
        for(int i=0; i<=n-1; i++)
        {
            System.out.println("Enter input for index "+i);
            arr[i]= sc.nextInt();

        }

        //print
         System.out.println("Your array contains:");
         for(int val: arr){
            System.out.println(val);

         }
        


        

        
    }
    
}
