package JavaProject2;

public class CarTester {

    public static void main(String[] args) {

       Car [] cars= {new Truck(30000,"Red",1900),new Sedan(40000,"black",19)};

        for (Car c:cars){
           c.calculateSalePrice();


    }



}}
