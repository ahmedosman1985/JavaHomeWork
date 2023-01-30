package homeWorkClass15;

public class Task3 {
        //Create a method that will print whether given String is palindrome or not.

    boolean palindrome(String str){

        String reverse=new StringBuilder(str).reverse().toString();
        if (str.equals(reverse)){
            return true;
        }else {}
        return false;




    }
}
