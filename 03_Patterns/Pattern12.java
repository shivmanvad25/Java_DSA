

import java.util.Scanner;

// *****     //  *****
//  ****     //  **** 
//   ***     //  ***  
//    **     //  **            
//     *     //  * 


public class Pattern12 { public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    //first pattern

    // for(int i=a; i>=1; i--)
    // {
        
    //     for(int j=1; j<=a-i; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }

    // second pattern

    for(int i=a; i>=1; i--)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print("*");
        }
        
        for(int j=1; j<=a-i; j++)
        {
            System.out.print(" ");
        }
        
        System.out.println();

    }


    
       

    sc.close();
}
    
}
