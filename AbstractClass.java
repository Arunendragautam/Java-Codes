public class AbstractClass {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(h.color);
       // Mustang myHorse = new Mustang();
        // Animal-> Hourse -> Muastang

        

    }
}

abstract class Animal {
    // non abstract function/method
    String color;
    Animal() {
        System.out.println("animal constructor called");

    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();  


    

}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constuctor called");
    }
    void changeColor(){
        color = "dark broun";

    }
    void walk(){
        System.out.println("walk on 4 legs");
    }

}
class Mustang extends Horse{
    Mustang(){
        System.out.println(" mustang constructor called");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color ="yellow";
    }
    void walk(){
        System.out.println("walk on 2 legs");

    }

}
