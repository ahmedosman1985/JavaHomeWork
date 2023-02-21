package JavaProject1;

public class Task4 {
    public static void main(String[] args) {
        // Create a 2D array or integer type where you will store odd and even numbers. Develop a program which
        // will identify/print the even numbers only.

        int number [][]={{10,21,31,40},
                         {15,50,66,45},
                         {10,11,13,16}};


        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j < number[i].length ; j++) {
                if (number[i][j]%2==0){
                System.out.println(number[i][j]);
            }


        }
    }
}}
