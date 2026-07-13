//Program to calculate average of array elements.

public class Arr05_Average {
    public static void main(String[] args) {
        

        int[] arr = {40, 30, 50, 60, 20, 10};

        int sum = 0;

        for (int elements: arr) {

            sum+=elements;
            
        }

        double average = (double)sum/arr.length;

        System.out.println("Average of elements is : " +average);


    
    }
    
}
