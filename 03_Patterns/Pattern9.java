

// first pattern 
// 12345
// 1234
// 123
// 12
// 1

import java.util.Scanner;

public class Pattern9 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=a; i>=1; i--)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print(j);
    //     }
    //     System.out.println();

    // }


    
    // SECOND TYPE
    // ABCDE
    // ABCD
    // ABC
    // AB
    // A


    for(int i=a; i>=1; i--)
    {
        char ch = 'A';
        for(int j=1; j<=i; j++)
        {
            System.out.print(ch);
            ch++;
        }
        System.out.println();

    }




    


    sc.close();
}
    
    
}
