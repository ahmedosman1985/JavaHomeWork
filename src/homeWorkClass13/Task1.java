package homeWorkClass13;

public class Task1 {
    public static void main(String[] args) {
       // Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String str="I am trying to understand java and practise help me god!";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);


    }
}
