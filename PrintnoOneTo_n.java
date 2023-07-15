import java.util.*;
public class PrintnoOneTo_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int counter = 1;
       
       while(counter <= n){
        System.out.print(counter +" ");
        counter++;
       }
       System.out.println();
       sc.close();
       

    }
    
}
