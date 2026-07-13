

import java.util.Scanner;

// *****
// *  *
// * *
// **
// *

public class Hollowtriside {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=1; i<=a; i++)
    {
        for(int j=i; j<=a; j++)
        {
           if(i==1 || j==a || i==j)
                System.out.print("*");
           else
                System.out.print(" ");
           
        }
        System.out.println();

    }

    sc.close();
}
    
    
}
