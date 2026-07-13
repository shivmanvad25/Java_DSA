

import java.util.Scanner;

// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

public class ConcentricSqr {public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("ENTER THE ROWS OF PATTERN : ");

    int a = sc.nextInt();
    
    int n = a;//a=4
    for(int i=1; i<=2*a-1; i++)
    {
        for(int j=1; j<=2*a-1; j++)
        {
            if(i==1 || i==2*a-1|| j==2*a-1 || j==1)
                System.out.print(n);
            else 
                System.out.print(n-1);
           

        }
        System.out.println();
        
       

    }

    sc.close();
}
    
}
