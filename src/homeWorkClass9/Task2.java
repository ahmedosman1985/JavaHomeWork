package homeWorkClass9;

public class Task2 {
    public static void main(String[] args) {
       //Create an array of names and store all names of your group. Then print your name from that array.
        // (use 2 different ways of creating an array).

        String []names={"Diana","Emad","Sam","Rania","Ahmed","Joesph","Peter","Tamer"};
        System.out.println(names[4]);

        System.out.println("**********************");

        String[] names2=new String[8];
        names2[0]="Diana";
        names2[1]="Emad";
        names2[2]="Sam";
        names2[3]="Rania";
        names2[4]="Ahmed";
        names2[5]="Joesph";
        names2[6]="Peter";
        names2[7]="Tamer";

        System.out.println(names2[4]);


    }
}
