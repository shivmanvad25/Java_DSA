//Program to find a single number out repeated numbers.

public class Arr35_SingleNumber {

    public static int singlenum(int[] arr){

        
        
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                
                if(arr[i]==arr[j]){
                    count++;
                    
                } 
                
            }
           if(count==1)
                    return arr[i];


        }
       return 0;
        
        
        
    }
    public static void main(String[] args) {
        int[] arr ={ 7};
        System.out.println("Single number is: "+singlenum(arr));
        
    }
    
}
