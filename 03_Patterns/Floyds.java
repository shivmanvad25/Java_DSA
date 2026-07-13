

import java.util.Scanner;

// 1                 1
// 23                2 3
// 456               4 5 6
// 78910             7 8 9 10
// 1112131415
                    

public class Floyds {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    int n=1;
    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(n);
            n++;
        }
        System.out.println();

    }


    // for second pattern

    // int n =1;
    // for(int i=1; i<=a; i++)
    // {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.printf("%d ",n);
    //         n++;
    //     }
    //     System.out.println();
    
    //}

    sc.close();
}

}
    

    

