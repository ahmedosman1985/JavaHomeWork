package JavaProjectJan17;

public class Task5 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program which will calculate the sum of
        // even and odd numbers for that array.
        int even=0;
        int odd=0;

        int numbers[][]={{10,11,12,13},
                         {20,21,22,23},
                         {30,31,32,33}};



        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if (numbers[i][j]%2==0){
                    even+=numbers[i][j];
                } else if (numbers[i][j]%2!=0) {
                    odd+=numbers[i][j];

                }

            }

        }System.out.println(even);
        System.out.println(odd);
    }
}
