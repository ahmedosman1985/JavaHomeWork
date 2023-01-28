package homeWorkClass13;

public class Task5 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not

        String str="aba";

        int start=0;
        int end=str.length()-1;

        boolean isPalindorme=true;

        while (start<end){
            if (str.charAt(start)!=str.charAt(end)){
                isPalindorme=false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindorme){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
