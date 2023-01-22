package homeWorkClass11;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        String[][] groceries={{"Carrots","Cucumber","Lettuce","Tomatoes"},
                              {"Bananas","Apples","Oranges","Mangos"},
                           {"Milk","Yogurt","Cottage cheese","American cheese"},
                              {"Lays","Chocolate","Gummies","Chex mix"}};

        for (int i = 0; i < groceries.length ; i++) {
            System.out.println(Arrays.toString(groceries[i]));
        }
        System.out.println("**********");

        for(String [] list:groceries){
            System.out.println(Arrays.toString(list));
        }

    }
}
