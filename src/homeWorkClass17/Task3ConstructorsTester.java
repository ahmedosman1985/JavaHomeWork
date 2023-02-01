package homeWorkClass17;

public class Task3ConstructorsTester {
    public static void main(String[] args) {

        Task3Constructors person2=new Task3Constructors("Ali",30,"Hassan");
        person2.printName();


        //protected
        Task3Constructors person3=new Task3Constructors("Mosaad","Rawan",30," ");
        person3.printName();

    }
}
