import java.util.*;
public class solutionQtwo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.print("Enter an in inter: ");
        num = sc.nextInt();
        if ( isEven(num)){
            System.out.println("number is even");

        }else{
            System.out.println("nuber is odd");
        }
        sc.close();

    }
    public static boolean isEven(int number){
        if(number % 2 == 0){
        return true;
    } else{
        return false ;
     }
    
    
    
    }   
 } 
