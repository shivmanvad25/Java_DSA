

import java.util.Scanner;

public class combination {public static void main(String[] args) {
    


    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER VALUE OF n AND r :");
    int n = sc.nextInt();
    int r = sc.nextInt();
    int nfact = 1 ;

    for(int i = 1; i<=n; i++)
    {
        nfact *= i;
    }
    System.out.println("n! = "+nfact);

    int rfact = 1;
    for(int i =1; i<=r; i++)
    {
        rfact = rfact * i;
    }
    System.out.println("r! = "+rfact);

    int nmrfact = 1;
    for(int i =1; i<=(n-r); i++)
    {
        nmrfact = nmrfact * i;
    }
    System.out.println("r! = "+nmrfact);

    System.out.println("Combination = " +(nfact/(rfact*nmrfact)));

   




    sc.close();


}
}
