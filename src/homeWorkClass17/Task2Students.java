package homeWorkClass17;

public class Task2Students {

    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students
    // with different marks. Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.

    String name;
    int sub1;
    int sub2;
    int sub3;

    Task2Students(String stName,int stSub1,int stSub2,int stSub3){
        name=stName;
        sub1=stSub1;
        sub2=stSub2;
        sub3=stSub3;

    }
    void printInfo(){

        System.out.println("Student "+name+" average score for his marks is "+((sub1+sub2+sub3)/3));
    }
}
