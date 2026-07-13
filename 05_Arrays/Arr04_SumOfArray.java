// sum of array elements.

public class Arr04_SumOfArray {

    public static void main(String[] args) {
        

        int[] arr = new int[]{10, 24, 56, 43, 60};
        
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
             sum+= arr[i];
            
        }

        System.out.print("Sum of array elements is : " +sum);
    }
}