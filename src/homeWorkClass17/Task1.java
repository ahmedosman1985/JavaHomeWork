package homeWorkClass17;

public class Task1 {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.

    String name;
    double weight;
    double height;
    int age;

    Task1 (String personName,double personWeight,double personHeight,int personAge){

        name=personName;
        weight=personWeight;
        height=personHeight;
        age=personAge;
    }
    Task1(){

        name="Ali";
        weight=75;
        height=5.8;
        age=30;
    }


    void printInfo(){
        System.out.println("Name "+name+" weight "+weight+" height "+height+" age "+age);
    }

}
