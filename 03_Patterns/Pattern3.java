

// 123456
// 123456
// 123456
// 123456
// 123456
// 123456

import java.util.Scanner;

public class Pattern3 {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=a; j++)
        {
            System.out.print(j);
        }
        System.out.println();

    }

    sc.close();
}
    
}

    

