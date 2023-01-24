package homeWorkClass12;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle
        of the String.
        For Example String str=hello =>l
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=input.next();
        if (!word.isEmpty()){
            if (word.length()>=3){
                int middle=word.length()/2;
                System.out.println("The middle letter in the entered word is "+word.charAt(middle));

            }
    }else{
            System.out.println("invalid input");
        }
}}
