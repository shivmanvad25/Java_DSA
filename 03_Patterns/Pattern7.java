

import java.util.Scanner;

///all type of left triangle

//1.
// *
// **
// ***
// ****
// *****

public class Pattern7 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();

    // }



    //second type

  // 1
  // 12
  // 123
  // 1234
  // 12345


    //    for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print(j);
    //     }
    //     System.out.println();

    // }


  //third type
    // A
    // AB
    // ABC
    // ABCD
    // ABCDE


    for(int i=1; i<=a; i++)
    {
        char ch = 'A';
        for(int j=1; j<=i; j++)
        {
            System.out.printf("%c ",ch );
            ch++;
        }
        System.out.println();

    }

    // 1
    // 22
    // 333
    // 4444
    // 55555


    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(i);
            
        }
        System.out.println();

    }










    sc.close();
}
    
}

    

