

import java.util.Scanner;

//  A                // A            //ABCDE
//  BB               // BC           //BCDE
//  CCC              // DEF          //CDE
//  DDDD             // GHIJ         //DE
//  EEEEE            // KLMNO        //E
                  
public class Character {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // FIRST PATTERN

    char ch = 'A';
    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(ch );
            ch++;
        }
        System.out.println();

    }

    //second pattern

    // char ch = 'A';
    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print(ch);   
    //     }
    //     System.out.println();
    //     ch++;

    // }



    //THIRD PATTERN

    // for(int i= 1; i<=a; i++)
    // {
    //     char ch = (char)(64 + i);
    //     for(int j=i; j<=a; j++)
    //     {
    //         System.out.print(ch);
    //         ch ++;

    //     }

    //     System.out.println();
        
        
    // }



    
    

    sc.close();
}
    
    
}
