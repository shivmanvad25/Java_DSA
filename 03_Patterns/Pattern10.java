


//MOST IPORTANT PATTERN
//     *
//    **
//   ***
//  ****
// *****

import java.util.Scanner;

public class Pattern10 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<= a-i; j++)
    //     {
    //         System.out.print(" ");
    //     }

    //     for(int j=1; j<=i; j++)
    //     { 
    //         System.out.print("*");
    //     }
        
    //     System.out.println();
 
    // }


    ///second method

    for(int i=a; i>=1; i--)
    {
        for(int j=1; j<= i-1; j++)
        {
            System.out.print(" ");
        }

        for(int j=1; j<=a-i+1; j++)
        { 
            System.out.print("*");
        }
        
        System.out.println();
 
    }

    ///third method

    for (int i = 1; i <= a; i++) 
    {
        for (int j = 1; j <= a; j++)
        {

        if (j <= a - i)
            System.out.print(" ");
        else
            System.out.print("*");
    }
    System.out.println();
}
    



    sc.close();

    
}
    
}
