package JavaProject2;

public class MarksTester {

    public static void main(String[] args) {

        Marks [] averageMarks={new A(75,85,95),new B(82,96,70,89)};
        for (Marks avg:averageMarks
             ) {

            avg.getPercentage();
        }
    }


}
