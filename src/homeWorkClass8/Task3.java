package homeWorkClass8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Write a program that reads a range of integers (start and end point), provided by a user and then from
        // that range prints the sum of the even and odd integers.

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a start number");
        int start=scan.nextInt();
        System.out.println("please enter an end number");
        int end=scan.nextInt();
        int evenSum=0;
        int oddSum=0;

        for (int i =start; i <=end ; i++) {
            if (i%2==0){
                evenSum+=i;

            }else{
             oddSum+=i;
            }
        }
        System.out.println("Sum of all the even numbers "+evenSum);
        System.out.println("Sum of all the odd number "+oddSum);
    }}

