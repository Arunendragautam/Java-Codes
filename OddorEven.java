public class OddorEven {

    public static void getoddorEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            // even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        getoddorEven(3);
        getoddorEven(11);
        getoddorEven(14);
        
    }
}
 