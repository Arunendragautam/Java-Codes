package ALPHAbATCHpRACTICE;
// binary search hmesha sorted array me lgta h ya toh increasing ho ya decreasing   

public class largestno {
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest  =Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
           
            else if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest value is" + getLargest(arr));
        return largest;
    
    }
    
        

    public static void main(String args[]){
        int arr[] = {1, 2, 6, 3, 5};
       int ans = getLargest(arr);
       System.out.println(ans);
        
        
    }
    
}
