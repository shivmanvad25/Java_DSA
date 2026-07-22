//Program to find leaders in an array.

public class Arr37_LeadersInArray {
    public static int[] leaders(int[] arr){

        int k=0;
        int leader[] = new int[arr.length];
        int temp = arr[arr.length-1];

        leader[k++]= temp;
        
        for(int i=arr.length-2; i>=0; i--){
            
             if(arr[i]>temp){
               leader[k++] = arr[i];
               temp = arr[i];
        
             }

            

            
        }        
        System.out.println("Leaders are: ");
        for(int i=k-1; i>=0; i--){
            System.out.print(leader[i]+ " ");
        
        }
        return leader;
               
        }
          
    public static void main(String[] args) {
        
        int[] arr= {16, 17, 4, 3, 5, 2};
        leaders(arr);

        
        
    }
}

