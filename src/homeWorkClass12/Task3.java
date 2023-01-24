package homeWorkClass12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter Mum first name");
        String mum=input.next();
        System.out.println("please enter dad first name");
        String dad=input.next();
        System.out.println("do you expect a boy or a girl?");
        String expect=input.next();
        //DANRY
        if (expect.equalsIgnoreCase("boy")){
            System.out.println("The suggested name of the baby is "+(dad.substring(0,3)).toUpperCase()+(mum.substring(2,4)).toUpperCase());
        } else if (expect.equalsIgnoreCase("girl")) {
            System.out.println("The suggested name of the baby is "+(mum.substring(0,2)).toUpperCase()+(dad.substring(3,6)).toUpperCase());
        }


    }
}
