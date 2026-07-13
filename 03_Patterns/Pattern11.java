
//     1
//    12
//   123
//  1234
// 12345

import java.util.Scanner;

public class Pattern11 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=a-i; j++)
        {
           System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }

 /// since its a square pattern so we can put condition here 

    // for(int i=1; i<=a; i++)
    // {
    //     int n = 1;
    //     for(int j=1; j<=a; j++)
    //     {
    //     if(j<=a-i)
    //     {
    //         System.out.print(" ");
    //     }
    //     else
    //     {
    //         System.out.print(n);
    //         n++;
    //     }
        
    //     }
    //     System.out.println();
    // }

    sc.close();
}
    
    
}
