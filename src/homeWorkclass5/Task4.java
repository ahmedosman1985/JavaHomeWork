package homeWorkclass5;

import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
        /* 4)Write a program for user to enter his/hers birth month. Based on the month define the season.
        Example: if user is born in June, July or August → season =”Summer”.
        At the end of the program we should see output as “You were born __”.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=input.next();

        switch (month){
            case "December":
            case "January":
            case "February":
                System.out.println("you were born in Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("you were born in Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("you were born in Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("you were born in Fall");
                break;
            default:
                System.out.println("invalid month");
        }

    }
}
