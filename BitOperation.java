public class BitOperation {

    //  get ith bit operation 
    public static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) ==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int setIthBit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;


    }
    public static int clearIthBit(int n, int i){
        int bitMask =  ~(1<<i);
        return n & bitMask;

    }
     public static int clearLastIthBits(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
     }
     public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
     }
     public static boolean isPowerofTwo(int n ){
        return (n&(n-1)) == 0;
     }
      public static int countSetBits(int n){  
        int count = 0;
        while(n >0){
            if((n & 1) != 0){ // check our LSB
                count++;
            }
             n = n>>1;

        }
        return count ;
     }
     public static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) !=0){ // check LSB
                ans = ans * a;

            }
             a = a * a;
             n = n>>1;

        }
        return ans;
     }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10,1));
        System.out.println( clearLastIthBits(15,2));
        System.out.println(clearBitsinRange(10, 2, 4));
        System.out.println(isPowerofTwo(8));
        System.out.println(countSetBits(15));
        System.out.println(fastExpo(3, 5));
    }
}
