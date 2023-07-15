public class Reverse_No {
    public static void main(String[] args) {
        int n = 10899;
        while (n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
             n = n / 10; //n/=10
        }
        System.out.println();
    }
    
}
