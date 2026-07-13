

import java.util.Scanner;

// AAAAA
// BBBBB
// CCCCC
// DDDDD
// EEEEE

public class Pattern6 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");
    int a = sc.nextInt();

    // for(int i = 1; i<=a; i++)
    // {
    //     for( int j = 1; j<=a; j++)
    //     {
    //         System.out.print((char)(64+i));
    //     }
    //     System.out.println();
    // }


    //2.

    // char ch ='A';
    // for(int i = 1; i<=a; i++)
    // {
    //     for( int j = 1; j<=a; j++)
    //     {
    //         System.out.print(ch);
    //     }
    //     System.out.println();
    //     ch++;
    // }



    //3.

    for(char i = 'A'; i<= 'A' + a; i++)
    {
        for( int j = 1; j <=a; j++)
        {
            System.out.print(i);
        }
        System.out.println();
        
    }
    


    sc.close();
    
}
    

    
}
