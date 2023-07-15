import java.util.*;
public class fun {
    public static void printHelloworld(){
        System.out.println("helloworld");
        System.out.println("hello World");
        System.out.println("hii bikku ");

   
    }
    public static void calculateSum( int num1, int num2){
       // Scanner sc = new Scanner(System.in);
       // int a = sc.nextInt();
       // int b = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is:"+sum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       int a = sc.nextInt();
       int b = sc.nextInt();


    calculateSum(a ,b);
    
        sc.close();
    }
    
    
}