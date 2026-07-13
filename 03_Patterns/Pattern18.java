

import java.util.Scanner;

//rhombus

public class Pattern18 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=1; i<=a; i++)
    {
        for(int j=a; j>=i; j--)
        {
            System.out.print(" ");
        }
        for(int j=1; j<=a; j++)
        {
            System.out.print("*");
        }

        System.out.println();

    }

    sc.close();
}
    

    
}
