package homeWorkclass5;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*7) Ask user to enter their country and capture it. Once values are captured print which language user speaks.
                 */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=input.nextLine();

        switch (country){
        case "Egypt":
            System.out.println("Arabic");
            break;
            case "UK":
                System.out.println("English");
                break;
            case "France":
                System.out.println("French");
                break;
            default:
                System.out.println("invalid country");

    }
}}
