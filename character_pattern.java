

public class character_pattern {
    public static void main(String[] args) {
        int n =4;
        char ch ='A';

        //outerloop
        for(int line = 1; line<=n; line++){
            // inner loop;
            for(int chars =1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
    }
    
}
