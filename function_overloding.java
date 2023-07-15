public class function_overloding {
    
    // func to cal int sum 
    public static int sum(int a , int b){
        return a+b;
    }
    //function to calc sum of three

    public static int sum (int a,  int b, int c){
        return a+b+c;
    }
    // function to calculate sum of float
    public static float sum (float a, float b, float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println( sum(3,5));
        System.out.println(sum(5,2,1));
        System.out.println(sum(2.0f, 3.4f, 2.0f));
    }

}
