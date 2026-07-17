//Method to find minimum of two numbers.

import java.util.Scanner;

public class Method08_MinOfTwo {

    public static int min(int a, int b){

        if(a>b){
            return b;
        }
        return a;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First number: ");
        int a = sc.nextInt();

        System.out.println("Second number: ");
        int b = sc.nextInt();

        System.out.println("Min of two: "+min(a, b));

        sc.close();
    }
    

}
    

