public class butterfly {
    public static void ButteryFly(int n) {
        // 1st half 
            for(int i= 1; i<=4; i++){
                // stars- i
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                } 
        
                
        
        
                //space- 2*(n-i)
                for(int j= 1; j<=2*(4-1); j++ ){
                    System.out.print(" ");
                }
                
        
        
                //stars- i
                for(int j=1; j<=i; j++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
        
            // 2nd half 
            for(int i =4; i>=1; i--){         
                   for(int j=1; j<=i; j++){
                System.out.print("*");
               } 
        
            
        
        
             //space- 2*(n-i)
             for(int j= 1; j<=2*(4-1); j++ ){
                System.out.print(" ");
               }
            
        
        
             //stars- i
             for(int j=1; j<=i; j++ ){
                System.out.print("*");
               }
             System.out.println();
            }
            
        }public static void main(String[] args) {
            ButteryFly(4);
        }
        
    }






