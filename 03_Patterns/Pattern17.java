

import java.util.Scanner;

// 12345
// 2345
// 345
// 45
// 5

public class Pattern17 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    // first method

    // for(int i=a; i>=1; i--)
    // {
    //     int n = a-i+1;
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print(n);
    //         n++;
            
    //     }
      
    //     System.out.println();   

    //}



    // second method

    for(int i=1; i<=a; i++)
    {
        for(int j=i; j<=a; j++)
        {
            System.out.print("*");
            
        }
      
        System.out.println();
    }
        


    sc.close();
}
    
    
}
