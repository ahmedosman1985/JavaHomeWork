package homeWorkClass23;

import java.sql.SQLOutput;

public class Computer {

    /*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
   Define some methods specific to child classes
   Create objects of child classes and store them into array. Loop through each object and execute available methods.
      */

    void assistant(){
        System.out.println("computers has assistant");
    }
    void latestModel(){
        System.out.println("Computers has latest model");
    }
    void operatingSystem(){
        System.out.println("computers have different operating systems");
    }
}

class Apple extends Computer{
    @Override
    void assistant() {
        System.out.println("The assistant of Apple phones is Siri");
    }

    @Override
    void latestModel() {
        System.out.println("The latest model of Apple is IPhone 14");
    }

    @Override
    void operatingSystem() {
        System.out.println("The operating system of Apple is ios");
    }

}
class Lenovo extends Computer{
    @Override
    void assistant() {
        System.out.println("The assistant of Lenovo is Cortana");
    }

    @Override
    void latestModel() {
        System.out.println("The latest model of Lenovo is A7");
    }

    @Override
    void operatingSystem() {
        System.out.println("The operating system of Lenovo is android");
    }

}

class HP extends Computer{
    @Override
    void assistant() {
        System.out.println("The assistant of HP is google assistant");
    }

    @Override
    void latestModel() {
        System.out.println("The latest model of HP is slate 17");
    }

    @Override
    void operatingSystem() {
        System.out.println("The operating system of HP phones is android as well");
    }

}

class Dell extends Computer{
    @Override
    void assistant() {
        System.out.println("Dell assistanty is not BIXBY");
    }

    @Override
    void latestModel() {
        System.out.println("latest model of Dell is streak");
    }

    @Override
    void operatingSystem() {
        System.out.println("dell uses android too");
    }

}
