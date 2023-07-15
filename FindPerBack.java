public class FindPerBack {

    public static void getpermutation(String str, String ans){
        // base case
        if(str.length() == 0 ){
            System.out.println(ans);
            return;
        }


        //recursion
        for(int i =0; i< str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab" + "de" = "abde"
           String NewStr = str.substring(0, i) + str.substring(i+1 );
            getpermutation(NewStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        getpermutation(str,"");
        
    }
    

}
