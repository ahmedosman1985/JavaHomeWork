package homeWorkClass12;

public class Task2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS)

        String day="Sunday";
        String rev="";
           for (int i = day.length()-1; i >=0 ; i--) {
            System.out.print(day.charAt(i));
            rev=rev+day.charAt(i);
        }
        System.out.println();
        System.out.println("*********");
        System.out.println("The word in reverse is "+rev);
    }
}
