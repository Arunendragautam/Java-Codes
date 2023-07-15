public class InsertionShort {
    public static void getinsertionsort(int arr[]){
        for(int i = 1 ; i<arr.length-1; i++){
            int curr = i;
            int prev = i-1;
            // finding out the correct pos to insert
            while(prev >=0 && arr[prev]> arr[curr]){
                arr[prev+1] = arr[prev];
                prev -- ;
            }
            // insertation
            arr[prev+1] = curr;

             }
        }
        public static void printArr(int arr []){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i]+" ");

                 }
                   System.out.println(); 
             } 
           public static void main(String[] args) {
            int arr [ ] = { 5 , 4, 1, 3, 2};
            getinsertionsort(arr);
            printArr(arr);
 
    }
}
