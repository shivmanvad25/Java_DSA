

import java.util.Scanner;
// IMPOSIBLEE ;|// by combinations

//  1                         1
//  11                      1   1
//  121                   1   2   1
//  1331                1   3   3   1
//  14641             1   4   6   4   1

public class Pascals{
    int fact(int x)
    {
        int fact =1;
        for(int i=1; i<=x;i++)
        {
            fact*=i;

        }
        return fact;

    }

 void main() {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=0; i<=a-1; i++)
    {
        for(int j=a-1; j>=i; j--)
        {
            System.out.print(" ");

        }

        for(int j=0; j<=i; j++)
        {
            int value = fact(i)/(fact(j)*fact(i-j));

            System.out.print(value+ " ");
        }

        System.out.println();

    }

    sc.close();
}
}

