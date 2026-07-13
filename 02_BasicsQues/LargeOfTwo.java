

import java.util.Scanner;

public class LargeOfTwo {public static void main(String[] args) {

    Scanner sc = new Scanner(System .in);

    System.out.println("ENTER TWO NUMBERS : ");
    int firstNum = sc.nextInt();
    int secNum = sc.nextInt();


    // System.out.printf( "A = %d%n",firstNum);
    // System.out.printf( "B = %d%n",secNum);

    System.out.println( "A = " +firstNum);
    System.out.println( "B = " +secNum);


    String result = (firstNum > secNum) ? "A is greater " : (firstNum < secNum) ? "B is greater " :"Both number are equal";

    System.out.println(result);

    sc.close();
    
}

    
}
