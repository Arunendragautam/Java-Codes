public class CopyConstructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Arunendra Gautam";
        s1.roll = 225;
        s1.password = "xyz";
        s1.marks[0]= 100;
        s1.marks[1] = 90;
        s1.marks[2] =80;


        Student s2 = new Student(s1);
        s2.password = "abcd";
        
        for(int i =0; i<3; i++){
            System.out.println(s2.marks[i]);
        }



    }
    
}
class Student {
    String name;
    int roll;
    String password;
    int marks[];
    // copy constructors
    Student(Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    Student(){
        System.out.println();
    }
    Student(String name){
        marks = new int[3];
        this.name =name;

    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;

    }
}



