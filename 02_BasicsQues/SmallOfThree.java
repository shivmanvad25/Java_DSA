

import java.util.Scanner;

public class SmallOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THREE NUMBERS : ");

        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();
        int thirdNum = sc.nextInt();


        int smallest = firstNum;

        if(smallest > secNum)
        {
            smallest = secNum;
        }
        if(smallest > thirdNum)
        {
            smallest = thirdNum;
        }

        System.out.println("SMALLEST = " + smallest);


        sc.close();


        
       
        
    }
    
}
