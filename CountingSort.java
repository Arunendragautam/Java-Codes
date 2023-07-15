import java.util.*;
public class CountingSort {
    public static void getcountingSort(int arr []){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);

            
            int count [] = new int [largest+1];
            for(int i =0; i<arr.length; i++){
                count [arr [i]]++;

                // shorting 
                int j =0;
                for(int i= 0; i<count.length; i++){
                    arr[j] =i;
                    j++;
                    count[i] --;

                }

            }


        }
    }
    
}
