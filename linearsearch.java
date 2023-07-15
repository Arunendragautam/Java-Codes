package ALPHAbATCHpRACTICE;

public class linearsearch {
    public static int getPosition(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
            
            }
            return -1;

        }

    //ek ek krke 
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 10, 12, 14, 16};
        int key = 10;

        int index = getPosition(numbers, key);
        if(index == -1){
            System.out.println("key not found ");
        }
        else{
            System.out.println("key found" +" "+ index);
        }


    }
    
}
