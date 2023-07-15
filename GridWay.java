public class GridWay {
    public static int getgridWay(int i , int j, int n , int m){
        // base case
        if( i == n-1 && j == m-1 ){ // col for last cell
            return 1;

        }else if(i == n || j == n){ // boundary cross column
            return 0;
        }

        int W1 = getgridWay(i+1, j, n, m);
        int W2 = getgridWay(i, j+1, n, m);
        return W1 + W2;

    }
    public static void main(String[] args) {
        int n = 3; int m = 3;
        System.out.println(getgridWay(0,0 , n, m));
    }
    
}
