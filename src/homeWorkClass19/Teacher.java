package homeWorkClass19;

public class Teacher {

    //Write a Java program called Teacher.
    // Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features
    // and behaviour. Test all 4 classes

    String name;
    int id;
    int salary;
    String subject;

     void printName(){
        System.out.println("Teacher name is: "+name);
    }


    void printID(){
        System.out.println("Teacher ID is "+id);
    }


    void printSalary(){
        System.out.println("Teacher salary is "+salary);
    }
    void printSubject(){
        System.out.println("Teacher subject is "+subject);
    }
    void printTeacherInfo(){
        printName();
        printID();
        printSubject();
        printSalary();
    }
}

class MathTeacher extends Teacher {
    String schoolName;

    void attendance(){
        System.out.println("Teacher attendance is 100%");
    }

}
class ChemistryTeacher extends Teacher{
 int students;
    void attitude(){
        System.out.println("Teacher attitude is aggresive");
    }

}
class PianoTeacher extends Teacher{
    String instrument;

    void activity(){
        System.out.println("Teacher activity is playing music");
    }


}

