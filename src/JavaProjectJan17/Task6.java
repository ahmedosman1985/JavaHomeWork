package JavaProjectJan17;

public class Task6 {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable
        int a=10;
        int b=5;

       a=a+b;
       b=a-b;
       a=a-b;

        System.out.println("After swapping: "+"a= "+a+" b= "+b);

    }
}
