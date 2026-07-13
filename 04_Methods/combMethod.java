

import java.util.Scanner;

public class combMethod {
    int fact(int x){
         int fact =1;
         for(int i=1; i<=x; i++)
         {
            fact*=i;
         }
         return fact;

    }
    void main(){

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n AND r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
          
        int nfact =fact(n);
        int rfact =fact(r);
        int nmrfact = fact(n-r);

         System.out.println("Combination = "+((nfact)/((rfact)*(nmrfact))));
         sc.close();

    }
    
}
