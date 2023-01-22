package homeWorkClass11;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone1=new Phone();
        phone1.brand="Iphone";
        phone1.model="Iphone12";
        phone1.price=1300;
        phone1.color="blue";

        Phone phone2=new Phone();
        phone2.brand="Samsung";
        phone2.model="S22";
        phone2.price=1000;
        phone2.color="black";

        Phone phone3=new Phone();
        phone3.brand="Pixel";
        phone3.model="Pixel 7";
        phone3.price=899;

        phone1.silent();
        phone2.ring();
        phone3.newCall();


    }
}
