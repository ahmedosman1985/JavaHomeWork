package homeWorkClass8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes”
        // from a user program should stop asking.

        Scanner scan=new Scanner(System.in);
        for (int i =1; i <=10 ; i++) {
            System.out.println("do you want to apply for a credit card?");
        boolean creditCard=scan.nextBoolean();
            if (creditCard){
            break;

        }
    }
}}
