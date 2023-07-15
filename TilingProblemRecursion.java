public class TilingProblemRecursion {
     public static int tillingProblem(int n){ // 2 x n (floor size)
        // base case
        if(n == 0 || n==1){
            return 1;

        }
        //kam
        // vertical choice
        int fnm1 = tillingProblem(n-1);

        // horizontal choise
        int fnm2 = tillingProblem(n-2);

        int totWays = fnm1 + fnm2 ;
        return totWays;



    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
    
}
