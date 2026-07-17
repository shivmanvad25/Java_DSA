//Method to find maximum of two numbers.

import java.util.Scanner;

public class Method07_MaxOfTwo {
    public static int max(int a, int b){

        if(a<b){
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

        System.out.println("Max of two: "+max(a, b));

        sc.close();
    }
    
}
