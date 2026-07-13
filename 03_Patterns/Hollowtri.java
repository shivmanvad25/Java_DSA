

import java.util.Scanner;

//     *
//    * *
//   *   *
//  *     *
// *********

// (Hollow Pyramid)

public class Hollowtri {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=a-i; j++)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j++)
        {
            if(j==1 || j== 2*i-1 || i==a)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        // for(int j=1; j<=a-i; j++)
        // {
        //     System.out.print(" ");
        // }

        System.out.println();
    }

    sc.close();
}
    
}
