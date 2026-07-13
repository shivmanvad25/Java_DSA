import java.util.Scanner;

public class Arr02_TwoDArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        
      //Declaration
        int[][]arr;
     

        //Allocation
        arr = new int[2][2];

        //Input

        int brr[][] = new int[2][3];
    
        //input
        for (int i=0; i<brr.length; i++) {
            for(int j=0; j<brr[i].length; j++){
                System.out.println("Enter value for row="+i+"and column="+j);
                brr[i][j]=sc.nextInt();
            }
            
        }
        //print
        System.out.println("Array contains : ");
        for (int i=0; i<brr.length; i++) {
            for(int j=0; j<brr[i].length; j++){
                
                System.out.print(brr[i][j] + " ");
                
            }
            System.out.println();
        }
        

    }


    
}
