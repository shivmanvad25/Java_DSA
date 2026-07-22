public class Arr34_MaxConsequetiveOne {
    public static int maxones(int[] arr){

        int max=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            if(max<count){
            max=count;
        }
            
        }
        
            
        
        return max;
    }


public static void main(String[] args) {
        
        int[] arr ={1, 1, 0, 1, 1, 1, 0};

        System.out.println("Maximum consequetive 1's are: ");
        System.out.println(maxones(arr));
    }

}

