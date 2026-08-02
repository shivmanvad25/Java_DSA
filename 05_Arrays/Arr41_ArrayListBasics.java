import java.util.ArrayList;
import java.util.Scanner;

public class Arr41_ArrayListBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>(5);//initial capacity

        // //1.ADD

        // list.add(10);// we can add as many as we want.
        // list.add(23);
        // list.add(230);
        // list.add(45);
        // list.add(67);
        // list.add(88);
        // list.add(89);
        // list.add(9);

        // System.out.println(list);

        // //2. To check if it contains 
     
        // System.out.println(list.contains(45));
        

        // //3. update index

        // list.set(0, 99);

        // System.out.println(list);


        // //4. Remove index

        // list.remove(3);// index 3 will be removed
        // System.out.println(list);

        // //5. input or iterate

        for(int i=0; i<5; i++){
            list.add(in.nextInt());
        }

        //to get item at any index

        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+" ");
        }

    }
    
}
