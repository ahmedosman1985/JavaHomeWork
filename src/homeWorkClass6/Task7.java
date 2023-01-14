package homeWorkClass6;

public class Task7 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)

        int num=20;
        while (num>=0){
            if (num%2==0) {
             System.out.println(num);
            }
            num--;
        }            System.out.println("*****************");
        int num2=1;
        while(num2<=20){
            if (num2%2==0){
                System.out.println(num2);
            }num2++;
        }


    }
}
