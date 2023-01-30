package homeWorkClass16;

public class Task2 {
    /*Create a method that will take a String as a parameter and returns reversed String. Method should be available
     to all classes within your project and accessible by class name.


    return --> String
    name -->revStr
    parameters --> String
    */

    public String revStr(String str){

        String reversed=new StringBuilder(str).reverse().toString();
        return reversed;
    }

    public static void main(String[] args) {
        Task2 rev=new Task2();
        System.out.println(rev.revStr("Hello"));
    }
}

