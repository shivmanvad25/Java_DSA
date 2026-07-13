

//ALL TYPES OF INVERTED PATTERNS
//1. FIRST TYPE
    //    *****
    //    ****
    //    ***
    //    **
    //    * 

import java.util.Scanner;

public class Pattern8 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=a; i>=1; i--)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }



    //second way
    for(int i=1; i<=a; i++)
    {
        for(int j=a; j>=i; j--)
        {
            System.out.print("*");
            
        }
        System.out.println();

    }

    sc.close();
}
    
    
}
