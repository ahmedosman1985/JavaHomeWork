package homeWorkClass11;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        String [][]countries={{"USA","Canada","Mexico","Cuba"},
                             {"Brazil","Argentina","Colombia","Peru"},
                             {"Italy","Spain","France","Netherlands"},
                             {"Philippines","Thailand","Indonesia","India"},
                             {"Egypt","Nigeria","Ghana","Ethiopia"}};
        int sum=0;

        for (int i = 0; i < countries.length ; i++) {
            for (int j = 0; j < countries[i].length ; j++) {
                System.out.println(countries[i][j]);
                sum++;
            }


            }            System.out.println("Total number of countries is "+sum);

          System.out.println("***********");

        for (int i = 0; i < countries.length ; i++) {
            System.out.println(Arrays.toString(countries[i]));

        }
        for(String [] counts:countries){
            System.out.println(Arrays.toString(counts));


        }

    }
    }

