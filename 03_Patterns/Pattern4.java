

// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE

import java.util.Scanner;

public class Pattern4 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

   // int b = 64;

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=a; j++)
    //     {
    //         System.out.print((char)(64 + j));
    //     }
    //     System.out.println();

    // }

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=0; j<a; j++)
    //     {
    //         System.out.print((char)('A' + j));
    //     }
    //     System.out.println();

    // }


    
    for(int i=1; i<=a; i++)
    {
        char ch ='A';
        for(int j=1; j<=a; j++)
        {
            System.out.print(ch);
            ch++;
            
        }
        System.out.println();
        

    }

    sc.close();
}

    
}
