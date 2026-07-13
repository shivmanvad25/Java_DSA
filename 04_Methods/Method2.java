


public class Method2 {
    int value = 560;
    

    void greet(String name)
    {
        System.out.println("GOOD MORNING "+ name);
        praise(1000);
    }

    void main()
    {
        System.out.println("HELLO");
        System.out.println("Value = "+value);
        greet("SHIVMAN VADWAN");
        greet("Modi ji");

        System.out.println("peace out!!!!");
        praise(50);

        
        //float result = sum(5.56f,70,25);
        
        System.out.println("RESULT OF SUM = " +sum(25.5f,8,9));
    }
     void praise(int x)
     {
        System.out.println("She is pretty lady. x"+ x);
     }

     float sum(float a, int b, int c)
     {
        float sum = a+b+c;
        return sum;
     }
}
