public class hollow_rectangle {
    public static void hollorectangle(int totRows, int totColms){
        for(int i = 1; i<=totRows; i++){
            for( int j=1; j<=totColms; j++){
                if (i==1 || i==totRows || j==1 || j == totColms){
                 System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
                
                
            }
            System.out.println();

        }
    }public static void main(String[] args) {
        hollorectangle(4,5);
    }
    
}
