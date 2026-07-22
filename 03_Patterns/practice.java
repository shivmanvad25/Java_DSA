 import java.util.Scanner;
public class practice {
   
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows:");

        int row = sc.nextInt();

        for(int i=0; i<=row; i++){
            for(int j=1; j<row-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();


           
        }
        sc.close();
    }
    
}

    

