package JavaProject2;

public class Car {
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    void calculateSalePrice(){
        System.out.println("Price of the car is "+carPrice);

    }
}
    class Sedan extends Car{

        double length;
        public Sedan(double carPrice, String color, double length) {
            super(carPrice, color);
            this.length = length;
        }

        @Override
       public void calculateSalePrice() {

            if (length>20){
                System.out.println("The price of the "+color+" Sedan is "+(carPrice*95/100));
        }else{
                System.out.println("The price of the "+color+" Sedan is "+(carPrice*90/100));
            }
        }
    }

    class Truck extends  Car{
    double weight;

        public Truck(double carPrice, String color, double weight) {
            super(carPrice, color);
            this.weight = weight;
        }

        @Override
        public void calculateSalePrice() {
            if(weight>2000){
                System.out.println("The price of the "+color+" Truck is "+(carPrice*90/100));
        }else{
                System.out.println("The price of the "+color+" Truck is "+(carPrice*80/100));
            }
        }

    }
