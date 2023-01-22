package homeWorkClass11;

public class Task1 {
    public static void main(String[] args) {

        String [] []names= {{"Ahmed", "Diana", "Peter", "Sam"},
                            {"C", "D", "B", "A"},
        };
        for (int i = 0; i < names[0].length ; i++) {
            if (names[1][i].equals("A") || names[1][i].equals("B")){
                System.out.println(names[0][i]);
            }

        }

    }
}
