package homeWorkClass11;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        String [][] cars={{"American","German","Korean","Italian"},
                          {"Chevrolet","BMW","KIA","Fiat"} };

        for (int i = 0; i < cars.length ; i++) {
            System.out.println(Arrays.toString(cars[i]));

        }
        System.out.println("**************");

        for(String[]car:cars){
            System.out.println(Arrays.toString(car));
        }
    }

}
