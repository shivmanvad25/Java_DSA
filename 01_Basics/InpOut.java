import java.util.Scanner;

public class InpOut {
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);

         System.out.print("ENTER THE NUM : ");
        int x = scn.nextInt();
        System.out.println("Number is : "+ x);

         System.out.print("ENTER THE FLOATING NUM : ");
         float g = scn.nextFloat();
        System.out.println("NUMBER IS : " + g);

        System.out.print("Java ");
        System.out.println("python");
         float age = 29.5f;
         System.out.printf("Age = %f", age);

          double agee = 29.587;
          System.out.printf("Age = %2lu", agee);

        
        //3.
       // double age = 29.587998;
        //System.out.printf("Age = %f\n", age);

        //4. backslash
        //System.out.println("\\");
        System.out.println("\\");

        //5. tab space 
        //System.out.println("java\tpoiu");

        //6. double quote
        //System.out.println("\"poing\"");

        //7. string concatenation

        String name = "LOVE ";

        System.out.println(name);
        System.out.println("hi " +name);

        //8. variables

        double ageee = 80.67;
        System.out.println("Age = " + ageee);

        //9. printing multiple 

        int a = 89;
        char b = 90;

        System.out.println(a + " " + b);
        


        scn.close();

    
}
    
}
