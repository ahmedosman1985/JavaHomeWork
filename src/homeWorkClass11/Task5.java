package homeWorkClass11;

public class Task5 {
    public static void main(String[] args) {

        int [][] numbers={{10,15,18,20},
                          {17,12,26,31},
                          {81,96,13,24}};

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if(numbers[i][j]%2==0){
                System.out.println(numbers[i][j]);
            }

        }

    }}}

