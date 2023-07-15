public class diamond {
    public static void diamondpattern(int n){
        // 1st half 
        for( int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half code
        for( int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondpattern(4);
    }
} 

