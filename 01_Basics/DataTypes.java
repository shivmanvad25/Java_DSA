public class DataTypes {
    public static void main(String[] args) {

        int num1 = 200;
        System.out.println(num1);

        byte num2 = 20;
        System.out.println(num2);

        short num3 = 32767;
        System.out.println(num3);

        long num4 = 123456789;
        System.out.println(num4);
        double num5 = 256.3567;
        System.out.println(num5);
        float num6 = 129876543.45f;
        System.out.println("double = "+ num6);

        double num7 = 1.23456789;
        System.out.println(num7);

      boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
       // java do not read 1 as true
        // boolean eligibleToVote = 1;
        // System.out.println(eligibleToVote);

        char EligibleToVote = 'a';
        System.out.println(EligibleToVote);

        char firstCharacter = 65;
        System.out.println("My first character is : "+firstCharacter );

        char firrstCharacter = 112;
        System.out.println("My first character is : "+firrstCharacter );

        char fiirrstCharacter = 'a' + 4
        ;
        System.out.println("My first character is : "+fiirrstCharacter );

        char firrsstCharacter = 'a';
        System.out.println("My first character is : "+(firrsstCharacter + 5) );


        //char print karane ke liye explicitilly we used char
        char firrssstCharacter = 'a';
        System.out.println("My first character is : "+(char)(firrssstCharacter + 5) );
        


    }
}
