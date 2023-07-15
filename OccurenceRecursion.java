public class OccurenceRecursion {

    // WAF to find the first occurence of an element in an array
    public static int firstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

          return firstOccurence(arr, key, i+1);



    }
    public static int lastOccurence(int arr[], int key,  int i){
        if( i == arr.length){
            return -1;

        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
            return isFound;
        
    }
    //  Waf to find the last occurence of an element in array
    public static void main(String[] args) {
        int arr[] ={8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 5, 0));
        System.out.println(lastOccurence(arr, 5, 0));
        
    }
}
