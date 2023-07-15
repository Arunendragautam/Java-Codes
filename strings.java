// import java.util.*;
public class strings {
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        
    
        // char arr [] ={'a', 'b', 'c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        

        // Strings are immutable
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next();
        // System.out.println(name);
        // String fullName = "bikku gautam";
        // System.out.println(fullName.length());
        // concatination
        String firstName = "Arunendra";
        String lastName = "Gautam" ;
        String fullName = firstName + " " + lastName ;
        //System.out.println(fullName);
        printLetters(fullName);
     }
}
