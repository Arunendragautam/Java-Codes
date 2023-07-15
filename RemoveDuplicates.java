public class RemoveDuplicates {

    public static void removeDupliString(String str , int idx, StringBuilder newStr, boolean map[] ){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // Kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            // duplicate
            removeDupliString(str, idx+1, newStr, map);
        } else{
            map[currChar-'a'] = true;
            removeDupliString(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDupliString(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
