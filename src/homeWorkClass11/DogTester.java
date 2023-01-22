package homeWorkClass11;

public class DogTester {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="Milo";
        dog1.breed="Husky";
        dog1.color="Color";
        dog1.age=3;

        Dog dog2=new Dog();
        dog2.name="Teddy";
        dog2.breed="Bulldog";
        dog2.color="Black";
        dog2.age=1;

        Dog dog3=new Dog();
        dog3.name="Gracie";
        dog3.breed="Labrador";
        dog3.color="gold";
        dog3.age=2;

        dog3.eat();
        dog1.sleep();
        dog2.speak();

    }


}
