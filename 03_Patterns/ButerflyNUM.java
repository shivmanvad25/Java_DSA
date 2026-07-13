
import java.util.Scanner;

//easy peezy 

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

public class ButerflyNUM {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();

    for(int i=1; i<=a; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print(j);
        }
        for(int j=1; j<=2*(a-i); j++)
        {
            System.out.print(" ");
        }
        int num=i;
        for(int j=1; j<=i; j++)
        {
            System.out.print(num);
            num--;
        }
        

        System.out.println();

    }

    sc.close();
}
    

    
}
