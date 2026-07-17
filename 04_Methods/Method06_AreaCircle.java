//Method to find area of a circle.

import java.util.Scanner;

public class Method06_AreaCircle {
     public static double areaCircle(double radius){
        return 3.14 * radius * radius;
     }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        int a = sc.nextInt();

        System.out.println("Area of circle: "+areaCircle(a));
        
     }
    
}
