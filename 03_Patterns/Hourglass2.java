

import java.util.Scanner;

// *****
// ****
// ***
// **
// *
// **
// ***
// ****
// *****

public class Hourglass2 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=i; j<=a; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }
    // for(int i=2; i<=a; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }
     

    //second approach
    for(int i=1; i<=2*a-1; i++)
    {
        int stars;

        if (i <= a)
            stars = a - i + 1;
        else
            stars = i - a + 1;

        for(int j=1; j<=stars; j++)
        {
            System.out.print("*");
            
        }
        System.out.println();

    }
    
    sc.close();
    
}
}
