package homeWorkClass13;

public class Task6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?

        String x="Ahmed";
        String y="Osman";
        x= x+y;
        //AhmedOsman
        System.out.println(x);
        y=x.substring(0,(x.length()-y.length()));
        System.out.println("The new y is "+y);
        x=x.substring(5,(x.length()));
        System.out.println("The new x is "+x);



    }
}
