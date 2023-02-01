package homeWorkClass17;

public class Task5Student {
    //Write a Student class that have instance variables name and address. Create a constructor that will initialize
    // those variables. Print name & address of given  student using displayInfo method.

    String name;
    String address;

    Task5Student (String sName, String sAddress){
        name=sName;
        address=sAddress;
    }
    void displayInfo(){
        System.out.println("Student Name is "+name+" and his address is "+address );
    }
}
