public class CharactersBits {
    public static void main(String[] args) {
        // Conver uppercase character to lowercase
        for( char ch = 'A' ; ch <='Z' ;  ch++) {
            System.out.println((char) (ch | ' '));
            // prints abcdefghijklmnopqqertyxyz

        }
    }
    
}
