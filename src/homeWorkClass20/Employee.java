package homeWorkClass20;

public class Employee {

    /* Create an Employee class that will have variables and methods.
    Constructor that should initialize instance variables
    Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
    Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
    Test your code!
     */

    String name;
    int id;

    Employee(String name, int id){
        this.name=name;
        this.id=id;

    }
    void printInfo(){
        System.out.println("Employee name is "+name+" and his id is "+ id);
    }
}
class FullTime extends Employee{

    int noOfHours;
    FullTime (int noOfHours,int id,String name){
        super(name,id);
        this.noOfHours=noOfHours;
    }
    void displayData(){
        System.out.println("Employee "+name+" his id is "+id+" works a full time shift with no of hours of "+noOfHours);
    }
}

class PartTime extends Employee{
    int bonus;

    PartTime(String name,int id,int bonus){
        super(name,id);
        this.bonus=bonus;
    }
    void displayPInfo(){
        System.out.println("Part time employee is "+name+" and his id is "+id+ " gets bonus of "+" bonus");
    }
}
class Tester extends FullTime{

    int incentives;

    Tester(int id,int noOfHours,int incentives,String name){
        super(id,noOfHours,name);
        this.incentives=incentives;

    } void printTester(){
        System.out.println("Employee name is "+name+" his id is "+id+" he works no of hours of "+noOfHours+" he takes incentives of "+incentives);
    }

    public static void main(String[] args) {

        Employee emp=new Employee("Ahmed",12345);
        emp.printInfo();

        FullTime full=new FullTime(8,5854,"Sam");
        full.displayData();

        PartTime part=new PartTime("Rania",4280,1000);
        part.displayPInfo();

        Tester tester=new Tester(5924,12,5000,"Emad");
        tester.printTester();
    }
}
