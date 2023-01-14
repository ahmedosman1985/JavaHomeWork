package homeWorkclass5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*5) Write a program to find largest of three double values using if-else..if and logical operators provided
        by a user (numbers must be distinct)
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three double numbers");
        double num1,num2,num3;
        num1=input.nextDouble();
        num2=input.nextDouble();
        num3=input.nextDouble();

        if(num1>num2 && num1>num3){
            System.out.println("The largest number is "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The largest number is "+num2);

        }else{
            System.out.println("The largest number is "+num3);
        }


    }
}
