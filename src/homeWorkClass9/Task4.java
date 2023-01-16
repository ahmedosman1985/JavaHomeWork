package homeWorkClass9;

public class Task4 {
    public static void main(String[] args) {

        //Create an array that can store names of cars and store 6 elements into it.
        // Print all values from the array.

        String[] cars=new String[5];
        cars[0]="Tesla";
        cars[1]="BMW";
        cars[2]="Mercedes";
        cars[3]="Toyota";
        cars[4]="Kia";

        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);

        }

    }
}
