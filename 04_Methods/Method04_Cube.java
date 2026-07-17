//Method to find cube of a number.

import java.util.Scanner;

public class Method04_Cube {
    public static int cube(int n){

        return n * n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther number: ");
        int a = sc.nextInt();

        System.out.println("Cube of number is: "+cube(a));
    }
    
}
