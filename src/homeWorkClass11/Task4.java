package homeWorkClass11;

public class Task4 {
    public static void main(String[] args) {

        int [][] numbers={{15,17,22},
                         {22,33,41},
                         {58,14,27}};
        int sum=0;

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                sum+=numbers[i][j];


            }

        }
        System.out.println(sum);
    }
}
