package homeWorkClass13;

public class Task2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters. Find out how many
        // Alphanumeric(abd AZ 284) characters are there in the String.

        String str="abdfhjasdfadf ASFDLKJNASFLK 2846549";
        String str2=str.replaceAll("[]A-Za-z0-9]","*");
        System.out.println(str2);

        int count=0;
        for (int i = 0; i <str2.length() ; i++) {
            if (str2.charAt(i)=='*'){
                count++;
            }
        }
        System.out.println("The Alphanumeric characters count is "+count);

        //Asghar way
        String str3="jnfjdnJNJFD87687&*(()";
        System.out.println(str3.replaceAll("[^A-Za-z0-9]","").length());


    }
}
