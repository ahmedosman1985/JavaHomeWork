package homeWorkclass5;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
/*2) Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”,
anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
 */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a day number");
        int day=input.nextInt();
        if(day>=1 && day<=5){
            System.out.println("it's a weekday");
        }else if(day>=6 &&day<=7){
            System.out.println("it's a weekend");
        }else {
            System.out.println("invalid day");
        }
       switch (day){
           case 1:
           case 2:
           case 3:
           case 4:
           case 5:
               System.out.println("it's a weekday");
               break;
           case 6:
           case 7:
               System.out.println("it's a weekend");
               break;
           default:
               System.out.println("invalid day");
       }

    }
}
