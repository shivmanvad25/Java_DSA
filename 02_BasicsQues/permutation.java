

import java.util.Scanner;

public class permutation { 
    
    int permu(int x)
    {
        int fact=1;
        for(int i =1; i<=x; i++)
        {
            fact*=i;
        }
        return fact;
    }
    void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n AND r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = permu(n); 
        int rfact = permu(n-r);

        System.out.println("Permutation = "+(nfact/rfact));


        sc.close();
    }
    
}
