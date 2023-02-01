package homeWorkClass17;

public class Task3Constructors {

    //Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,
    // default,protected) and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.

    String name;
    String lastName;
    int age;
    String sonName;
    private Task3Constructors(String pName, String pLastName, int pAge){
        name=pName;
        lastName=pLastName;
        age=pAge;
    }

    public Task3Constructors(String p2Name, int p2Age, String p2LastName){
        name=p2Name;
        lastName=p2LastName;
        age=p2Age;
    }

    Task3Constructors(int hisAge,String first,String last){
        age=hisAge;
        name=first;
        lastName=last;
    }
    protected Task3Constructors(String p3last,String p3first,int p3Age, String p3Son){

        name=p3first;
        lastName=p3last;
        age=p3Age;
    }
    public void printName(){
        System.out.println("Person name is "+name+" "+lastName+ " and age is "+age);
    }

    public static void main(String[] args) {

        Task3Constructors person=new Task3Constructors("Ahmed","Osman",37);
        person.printName();
    }

}
