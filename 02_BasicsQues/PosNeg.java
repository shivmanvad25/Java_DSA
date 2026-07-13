

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = sc.nextInt();

        // int positive = (num % 2) == 0; it cant be this because comparison always
        // stores true or false

        // String result = (num>0) ? "NUMBER IS POSITIVE " : " NUMBER IS NEGATIVE ";

        // String result = (num>0) ? "NUMBER IS POSITIVE" : (num<0)? "NUMBER IS NEGATIVE" : "NUMBER IS ZERO";





        // most basic

        // String result = (num==0)? "NUMBER IS ZERO" :(num>0 && num%2==0) ? "POSITIVE
        // EVEN" : (num<0 && num%2 !=0)? "NEGATIVE ODD " :(num>0 && num%2!=0)? "
        // POSITIVE ODD" : "NEGATIVE EVEN";

         boolean even = num % 2 == 0;
         boolean positive = num > 0;

        //1.

        // String result = (num == 0) ? "NUMBER IS ZERO"
        //         : positive
        //                 ? (even ? "POSITIVE EVEN" : "POSITIVE ODD")
        //                 : (even ? "NEGATIVE EVEN " : "NEGATIVE ODD");

        //2.
        // if(positive) 
        // {
        //     if(even)
        //     {
        //         System.out.println("POSITIVE EVEN");
        //     }
        //     else
        //     {
        //         System.out.println("POSITIVE ODD");
        //     }
            
        // }
        // else
        // {
        //     if(even)
        //     {
        //         System.out.println("NEGATIVE EVEN");
        //     }
        //     else
        //     {
        //         System.out.println("NEGATIVE ODD");
        //     }

        // }


        //3.
        if(num==0)
        {
            System.out.println("NUMBER IS ZERO");

        }
        else{

        String pant = positive ? "POSITIVE" : "NEGATIVE";
        String champ = even ? "EVEN" : "ODD";

        System.out.println( pant + " " + champ);
        }




        //System.out.println(result);

        sc.close();
    }

}
