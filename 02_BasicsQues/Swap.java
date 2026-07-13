

import java.util.Scanner;

public class Swap 
{ public static void main(String[] args) {   

    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER TWO NUMBERS : ");

    int a = sc.nextInt();//10
    int b = sc.nextInt();//5

    System.out.println("BEFORE SWAPPING : ");
    System.out.println("a = " + a + "\nb = " + b);

    a = a+b;//15
    b = a-b;//10
    a = a-b;//5

    System.out.println("\nAFTER SWAPPING : ");
    System.out.println("a = " + a + "\nb = " + b);


    sc.close();

    
}
  
}
