

import java.util.Scanner;

// *        * 1
// **      ** 2
// ***    *** 3
// ****  **** 4
// ********** 5
// ****  **** 4
// ***    *** 3
// **      ** 2
// *        * 1

public class Butterfly {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }

        
    //     //for(int j=1; j<=10-2*i; j++)
    //     for(int j=1; j<=2*(a-i); j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }

    //     System.out.println();
       

    // }
    // for(int i=a-1; i>=1; i--)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }

    //     for(int j=1; j<=2*(a-i); j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }

    //     System.out.println();
       

    // }

    //second approch

    for(int i=1; i<=2*a-1; i++)
    {

        int stars = Math.min(i, 2*a-i);
        //or we can use this auto matically returns smaller value
        
        // int stars;
        // if(i<=a)
        //     stars = i;
        // else
        //     stars = 2*a-i;

        for(int j=1; j<=stars; j++)
        {
            System.out.print("*");
        }
        for(int j=1; j<=2*(a - stars); j++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=stars; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    sc.close();
}
    
}
