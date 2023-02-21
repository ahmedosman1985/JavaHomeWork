package JavaProject1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Using Scanner create an array of integer values. After the array is created, calculate the sum
        // of all stored elements in that array.

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter five numbers");
        int [] numbers=new int[4];
        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]= input.nextInt();
            sum=sum+numbers[i];
        }
        System.out.println("The sum of numbers is "+sum);


    }
}
