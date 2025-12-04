// two types of variables: instance variables and static variables
// variables use camelCase
// constants use uppercase

class student{

    String studentName; // instance variable
    static int studentCount = 0; //static variable
    static final String SCHOOL_NAME = "CSAEA";

    student(String n){
        studentName = n;
        System.out.println(n + "is a studdent at" + SCHOOL_NAME);

        studentCount++;

        System.out.println("Number of Students: " + studentCount);
    }

}

public class Variables{

    public static void main(String[] args){

        new student("Alex");
        new student("Finn");
        new student("Ben");
        new student("Benny");
        new student("Goober");
        new student("Sweetooth");
        new student("Bobo");

    }

}
