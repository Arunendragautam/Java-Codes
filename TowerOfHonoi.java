public class TowerOfHonoi {
    public static void getTowerOfHoni(int n, char src, char dest, char help){
        if(n ==1 ){
            System.out.println("move disk"+n+ " from "+src+ " to " + dest);
            return;
        }
        getTowerOfHoni(n-1, src, help, dest);
        System.out.println("move disk"+n+ " from "+src+ " to " + dest);
        getTowerOfHoni(n-1, help, dest, src);
    }
    public static void main(String[] args) {
        int n =3;
        getTowerOfHoni(n, 'A', 'C', 'B');
        
    }
    
}
