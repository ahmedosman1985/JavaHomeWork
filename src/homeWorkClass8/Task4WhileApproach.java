package homeWorkClass8;

import java.util.Scanner;

public class Task4WhileApproach {
    public static void main(String[] args) {
        //4) Write a program to ask a user to enter item they want to buy and the price of that item.
        // Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        // If user give more money program should return a change. Whenever a user done with payments program
        // should say "Thank you for shopping!"

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the item you want to buy");
        String item=scan.nextLine();
        System.out.println("Please enter the price of the item");
        int price=scan.nextInt();
        System.out.println("Please enter the paid amount");
        int moneyPaid=scan.nextInt();

        //while (moneyPaid<price){

        }

    }

