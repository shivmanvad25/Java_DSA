

import java.util.Scanner;

// 5
// 54
// 543
// 5432
// 54321

public class Pattern16 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=a; i>=1; i--)
    {
        for(int j=a; j>=i; j--)
        {
            System.out.print(j);
        }
        System.out.println();

    }

    //second approach

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=a; j>=a-i+1; j--)
    //     {
    //         System.out.print(j);
    //     }
    //     System.out.println();

    // }

    sc.close();
}
    
}
