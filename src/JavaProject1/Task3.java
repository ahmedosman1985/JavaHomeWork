package JavaProject1;

public class Task3 {
    public static void main(String[] args) {

        // Create a 2D array of integer values. Print the sum of all numbers.

        int sum=0;
        int [][] numbers={{10,20,30},
                          {40,50,60},
                           {60,70,80}};

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                sum+=numbers[i][j];
            }

        }            System.out.println(sum);



    }
}
