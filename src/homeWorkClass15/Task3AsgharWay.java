package homeWorkClass15;

public class Task3AsgharWay {
    void isPalindrome(String inputStr) {
        StringBuilder stringBuilder=new StringBuilder(inputStr);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if (inputStr.equals(reversedStr)) {
            System.out.println(inputStr+" is palindrome");
        }else {
            System.out.println(inputStr+" is NOT palindrome");
        }

    }

    public static void main(String[] args) {

        Task3 task3=new Task3();
        //String result=task3.isPalindrome("Kaya"); we cannot assign void methods to variables
        // System.out.println(task3.isPalindrome("Kaya");); cannot use void methods in Println
        //task3.isPalindrome("Kaya");
    }
}

