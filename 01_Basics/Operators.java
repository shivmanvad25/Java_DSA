public class Operators {public static void main(String[] args) {

    //ARITHMETHIC OPERATORS

     int b =45 ;
     int a = 70;


     int add = a + b;
     int subs = a - b;
     int mult = a * b;
     int div = a / b;
     int rem = a % b;

     System.out.println("addition = "+add);
     System.out.println("substraction = "+subs);

     //we use type casting here explicitt
     System.out.println("multiplication = "+(double)mult);
     System.out.println("division = "+(double)div);
     System.out.println("remainder= "+rem);

     //RELATIONAL OPERATORS

     int baller =45 ;
     int batter = 70;

     System.out.println(baller == batter);
     System.out.println(baller != batter);
     System.out.println(baller > batter);
     System.out.println(baller < batter);
     System.out.println(baller <= batter);
     System.out.println(baller >= batter);
     System.out.println(baller +  batter);

     //LOGICAL OPERATORS WHEN WE HAVE TO CLUB MULTIPLE CONDITIONS


     //unary operators

     int acc =102;

     int prefix = ++acc;
     int postfix = acc++;
     System.out.println(prefix);
     System.out.println(postfix);
     System.out.println(acc); 


     // type casting

     byte bb = 50;
     bb += 77;
     System.out.println(bb);

     byte bc = 50;

     bc = (byte)(bc + 12);
     System.out.println(bc);

      // java auto mattically promoted it to float i.e the largest type involved

     // char + char 
     
      int h = 89;
     char u = 'g';
     char v = 'j';
     System.out.println((int)u);
     System.out.println(v);
      System.out.println(u-v);
      System.out.println(u+v);
      System.out.println(u+1);
     System.out.println(u);
     System.out.println(v);
      System.out.println(u-v);
      System.out.println("hello " + (int)u +  (char)h);
      System.out.println(  (int)u +  (char)h);
      System.out.println("hello" + (int)u );
      System.out.println("hello " + (int)u +" " + (char)h);
      System.out.println("hello " + (int)u +" and " + (char)h);
      System.out.println("hello " + ( u + v ));

             

             






}
    
}
