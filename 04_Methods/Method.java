

public class Method { 
    void print2Table(){
        for(int i =1; i<=10; i++)
        {
            System.out.println("2 x " + i + " = " + (2*i));
        }
    }

     public static void main(String[] args) {
        
     
        //     System.out.println("hello");
        //     print2Table();
        //     System.out.println("last line/.......");
        //     add(5,60);
        //     System.out.println("LOVE SHIVMAN");
            
        //     //int result = add(5,90);
        //     //System.out.println(result);
        //    int VALUE = addd(9,7);
        //    System.out.println("Value = "+VALUE);
        sum();
        
        

        }
        
       void add(int x, int y){
       System.out.println("Sum = " +(x+y));
        substract();


       }
       void substract()
       {
         int a = 10;
         int b = 5;
         System.out.println("substract = "+(a-b));

       }

       int addd (int p, int q)
       {
        int sum = p+q;
        return sum;

       }

       static void sum()
       {
        int value = 20;// accesible only inside this function
        for(int i=1; i<=3; i++)
        {
            int cry = (5*i);
            System.out.println(cry);
        }
        System.out.println("VAL : " + value);
       }




    }


    

