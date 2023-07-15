import java.util.ArrayList;
//import java.util.*;
public class ArrayaList {
    public static void main(String[] args) {
    // ClassName objectName = new ClassName();
    ArrayList<Integer> list = new ArrayList<>();
    //ArrayList<String> list2 = new ArrayList<>();
    //ArrayList<Boolean> list3 = new ArrayList<>();

    list.add(1); // O(1)
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list.size());

    //Reverse print Arraylist
    for(int i = list.size()-1; i>=0; i--){
        System.out.print(list.get(i)+" ");

    }
    
    

    //print the ArrayList
    // for(int i =0; i<list.size(); i++){
    // System.out.print(list.get(i)+" ");
    // }
    // System.out.println();


    // Get operation -O(1)
   int element = list.get(2);
   System.out.println(element);

   // Delete
   list.remove(2);
   System.out.println(list);


   // set element at index
   list.set(2, 10);
   System.out.println(list);

   // contains
   System.out.println(list.contains(1));
   System.out.println(list.contains(11));

   //index me darect value ko add krna 
   list.add(1, 9); //O(n)
   System.out.println(list);

    

    }
    
}
