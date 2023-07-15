package ALPHAbATCHpRACTICE;
// time complexcity of linear search is O(n)

public class linearsearch1 {
    public static int getPosition(String food[], String key){
        for(int i=0; i<food.length; i++){
            if(food[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String food[] = {"idli", " pizza", "Dosa", "Sambahr"};
        String key = "Dosa";

        int index = getPosition(food, key);
        if(index == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found "+" "+ index);
        }

    }
    
}
