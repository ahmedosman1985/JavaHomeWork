package homeWorkClass6;

public class Task8 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        int num=20;
        while (num<=50){
            if (num%2!=0){
                System.out.println(num);
            }num++;
        }
        System.out.println("************");

        int num2=50;
        while (num2>=20){
        if(num2%2!=0){
            System.out.println(num2);
        }num2--;

    }
}}
