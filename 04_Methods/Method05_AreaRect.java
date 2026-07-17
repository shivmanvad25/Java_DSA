//Method to find area of a rectangle.

import java.util.Scanner;

public class Method05_AreaRect {
    public static int areaRectangle(int length, int breadth){
        return length * breadth;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int a = sc.nextInt();

        System.out.println("Enter breadth: ");
        int b = sc.nextInt();

        System.out.println("Area of rectangle is: "+areaRectangle(a, b));


        
    }
    
}
