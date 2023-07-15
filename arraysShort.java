import java.util.Arrays;
// inbult function use in arry short 
public class arraysShort {
   public static void  printArrays(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }

        
    }
    public static void main(String[] args) {
        int arr [] ={  5, 4, 1, 3, 2} ;
        Arrays.sort(arr, 0, 4 );
        printArrays(arr);
    }
    
}
