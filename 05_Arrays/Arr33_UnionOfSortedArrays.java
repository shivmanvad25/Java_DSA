//Program to find union of sorted arrays.

public class Arr33_UnionOfSortedArrays {
    public static int[] unionarray(int[] arr, int[]brr){

        int[] crr = new int[arr.length+brr.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr.length && j<brr.length){
            
            if(arr[i]<brr[j]){
                if(k==0 || arr[i]!=crr[k-1]){
                crr[k++]=arr[i];
                
                }
                i++;
            }
            else if(arr[i]==brr[j]){
                if(k==0 || arr[i]!=crr[k-1]){
                crr[k++]=arr[i];
                
                }
                i++;
                j++;

            }
            else{
                if(k==0 || brr[i]!=crr[k-1]){
                crr[k++]=brr[j];
               
                }
                j++;

            }
            
        }
        while (i<arr.length) {

           if (k==0 || crr[k-1]!=arr[i])  {
                crr[k++] = arr[i];
            }
            i++;
        }

        while (j<brr.length){

            if (k==0|| brr[j]!=crr[k-1]) {
                crr[k++] = brr[j];
            }
            j++;
        }
    

        for (int m=0; m<k; m++) {
            System.out.print(crr[m]+ " ");
            
        }


        return crr;
    }
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3,4};
        int[] brr = {2,3,5};

        System.out.println("union of two arrays is: ");

         unionarray(arr, brr);
        
        
    }
    
}
