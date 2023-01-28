package JavaProjectJan17;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Using Scanner create an array of countries. When an array is created, retrieve all values from it and while
        // retrieving those values print capital for each country. (use 2 different loops).

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter four countries");
        String countries[]=new String[4];
        String capitals []= {"Paris","Cairo","Amesterdam","Washington DC"};

        for (int i = 0; i < countries.length ; i++) {
            countries[i]=input.next();
            for (int j = 0; j < capitals.length ; j++) {
                //capitals[j]=;
                //System.out.println("The capital of "+);
            }

        }


        }

    }

