public class Arr46_EvenDigits {
    public static void main(String[] args) {
        
        int[] arr={-6};
        int ans = findNum(arr);

        System.out.println("Even number of digits are: "+ans);


    }
    static int findNum(int[] arr){

        int count = 0;
        for (int element : arr) {
            if(even(element)){
                count++;
            }
            
        }
        return count;
    }

    static boolean even(int num){
        if(countDigit(num)%2==0){
            return true;
        }
        return false;
        // return countDigit(num)%2==0;

    }
    static int countDigit(int num){
        // it is treating 0 as even

        if(num==0){// because it has one digit
            return 1;
        }
        if(num<0){
            num = -num ;
        }

        int count =0;

        while(num>0){
            count++;
            num/=10;
           
        }
        return count;
    }
    
    
}
