package homeWorkclass5;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /* Write a program to find largest number among three numbers using nested if provided by a user (numbers
        must be distinct)
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three values");
        int num1,num2,num3;
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();

        if (num1>num2){
            if (num1>num3){
                System.out.println("the largest number is "+num1);
            }
        }else if (num2>num1){
            if (num2>num3){
                System.out.println("the largest number is "+num2);
            }
        }else if(num3>num2){
            if(num3>num1){
            System.out.println("the largest number is "+num3);
        }

    }
}}
