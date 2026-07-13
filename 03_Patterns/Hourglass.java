

import java.util.Scanner;
//hourglass shape

// ********* //5
//  *******  //4
//   *****   //3
//    ***    //2
//     *     //1
//    ***    //2
//   *****   //3
//  *******  //4
// ********* //5

public class Hourglass {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=a; i>=1; i--)
    // {
    //     for(int j=1; j<=a-i; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=2*i-1; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }
    // for(int i=2; i<=a; i++)
    // {
    //     for(int j=1; j<=a-i; j++)
    //     {
    //         System.out.print(" ");
    //     }
    //     for(int j=1; j<=2*i-1; j++)
    //     {
    //         System.out.print("*");
    //     }
        
    //     System.out.println();

    // }


    for(int row=1; row<=2*a-1; row++)
    {
        int level;

        if(row<=a)
            level = a-row+1;
        else
            level = row-a +1;

        for(int j=1; j<=a-level; j++)
        {
            System.out.print(" ");

        }
        for(int j=1; j<=2*level-1; j++)
        {
            System.out.print("*");

        }
        System.out.println();
        
    }
    




    sc.close();
}

    
}
