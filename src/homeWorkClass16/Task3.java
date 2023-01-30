package homeWorkClass16;

public class Task3 {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.

    return -->String
    name --> vowels
    Parameters --> String
     */

    private String vowels(String str){
        String newStr=str.replaceAll("[^aeiou]","");
        return newStr;
    }

    public static void main(String[] args) {
        Task3 input=new Task3();
        System.out.println(input.vowels("hello"));
    }
}
