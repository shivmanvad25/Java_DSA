

import java.util.Scanner;

//     *
//    * *
//   *   *
//  *     *
// *       *
//  *     *
//   *   *
//    * *
//     *

public class Hollowdiamond {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=a-i; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=2*i-1; j++)
    //     {
    //         if(j==1 || j==2*i-1)
    //             System.out.print("*");
    //         else
    //            System.out.print(" ");
    //     }

    //     System.out.println();

    // }
    // for(int i=a-1; i>=1; i--)
    // {
    //     for(int j=a-1; j>=i; j--)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=2*i-1; j++)
    //     {
    //         if(j==1 || j==2*i-1)
    //             System.out.print("*");
    //         else
    //            System.out.print(" ");
    //     }

    //     System.out.println();

    // }


    // second approach

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=a-i; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=2*i-1; j++)
    //     {
    //         if(j==1 || j==2*i-1)
    //             System.out.print("*");
    //         else
    //            System.out.print(" ");
    //     }

    //     System.out.println();

    // }
    // for(int i=1; i<=a-1; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=2*(a-i)-1; j++)
    //     {
    //         if(j==1 || j==2*(a-i)-1)
    //             System.out.print("*");
    //         else
    //            System.out.print(" ");
    //     }

    //     System.out.println();

    // }


    //third approach
    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=a-i; j++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++)
        {
            if(j==1 || j==2*i-1)
                System.out.print("*");
            else
               System.out.print(" ");
        }

        System.out.println();

    }
    for(int i=a-1; i>=1; i--)
    {
        for(int j=a-1; j>=i; j--)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++)
        {
            if(j==1 || j==2*i-1)
                System.out.print("*");
            else
               System.out.print(" ");
        }

        System.out.println();

    }
    sc.close();
}
    
}
