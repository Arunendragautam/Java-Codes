public class factorial {
    public static int factorialf(int n ) {
        int f = 1;

        for (int i=1; i<=n; i++){
            f = f * i;
        }

        return f ; // factorial of n

    }
    public static void main(String[] args) {
        System.out.println(factorialf(4));
    }
}
