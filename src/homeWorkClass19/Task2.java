package homeWorkClass19;

public class Task2 {
    //Write program to inherit class A that has method printF which is static and call or reuse that method into class B

    static void printF(){
        System.out.println("I'm the sentence from parent class");
    }

}

class B extends Task2{

void callMethod(){
    printF();
}

    public static void main(String[] args) {

 B task2=new B();
 task2.callMethod();

    }
}


