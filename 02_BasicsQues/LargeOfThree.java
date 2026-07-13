

import java.util.Scanner;

public class LargeOfThree {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers :");

        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();
        int thirdNum = sc.nextInt();

        //1.
        // System.out.println("First NUM : " +firstNum + "\nSecond Num : " + secNum + "\nThird Num : " +thirdNum );
        

        //2. this is a text block here just by pressing enter it shifts to next line

        // System.out.println("""
        //     First NUM : %d 
        //     Second Num : %d
        //     Third Num : %d""".formatted(firstNum,secNum,thirdNum));

        //3. This is professional

        System.out.printf(" First num : %d%n Second num : %d%n Thord num : %d%n",firstNum,secNum,thirdNum);
                    

        // if(firstNum>secNum)
        // {
        //     if(firstNum>thirdNum)
        //     {
        //         System.out.println(" FIRST NUMBER IS THE LARGEST.");
        //     }
        //     else
        //     {
        //         System.out.println(" THIRD NUMBER IS LARGEST.");
        //     }


        // }
        // else
        // {
        //     if(secNum>thirdNum)
        //     {
        //         System.out.println(" SECOND NUMBER IS LARGEST.");
        //     }
        //     else{
        //         System.out.println(" THIRD NUMBER IS LARGEST.");
        //     }
    

        // }

        //2. most optimal method most programmers used it. its called tracking and we dont have to check edge cases it will directly give the largest number

        int largest = firstNum;

        if(largest<secNum)
        {
            largest = secNum;
        }
        if(thirdNum>largest)
        {
            largest = thirdNum;
        
        }
        System.out.println("LARGEST = " +largest);


        //3.
        // if(firstNum==secNum && secNum==thirdNum )
        // {
        //     System.out.println("ALL NUMBERS ARE EQUAL.");
        
        // }
        // else if( firstNum==secNum && secNum>thirdNum)
        // {
        //     System.out.println(" FIRST AND SECOND NUMBER ARE EQUAL AND GREATEST.");
        // }
        // else if( firstNum==thirdNum&& secNum<thirdNum)
        // {
        //     System.out.println(" FIRST AND THIRD NUMBER ARE EQUAL AND GREATEST.");
        // }
        // else if( thirdNum==secNum && secNum>firstNum)
        // {
        //     System.out.println(" FIRST AND SECOND NUMBER ARE EQUAL AND GREATEST.");
        // }
        // else if( firstNum==secNum && secNum<thirdNum)
        // {
        //     System.out.println("THIRD NUMBER IS LARGEST. ");
        // }
        // else if( firstNum==thirdNum && secNum>thirdNum)
        // {
        //     System.out.println("SECOND NUMBER IS LARGEST. ");
        // }
        // else if( thirdNum==secNum && firstNum>thirdNum)
        // {
        //     System.out.println("FIRST NUMBER IS LARGEST. ");
        // }
        // else
        // {

        // System.out.println((firstNum>secNum)?
        //  (firstNum>thirdNum ? " First Number is Greatest.": " Third Number is greatest.") 
        //  : (secNum>thirdNum ? " Second  Number is Greatest." : " Third Number is Greatest.") );
        // }

        sc.close();


        
    }
    
}
