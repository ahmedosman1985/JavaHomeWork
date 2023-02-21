package JavaProject2;

public interface Shape {

    void calculateArea ();

    void calculatePerimeter();

    final double pi=3.14;
}
class Circle implements Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public void calculateArea() {

        System.out.println("The area of this circle is "+(pi*(radius*radius)));
    }



    @Override
    public void calculatePerimeter() {

        System.out.println("The Perimeter of this circle is "+(2*pi*radius));

    }
}
class Square implements Shape{

    int sideLength;
    Square(int sideLength){
        this.sideLength=sideLength;
    }
    @Override
    public void calculateArea() {
        System.out.println("The area of this square is "+(sideLength*sideLength));
    }
    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of this square is "+(4*sideLength));
    }

}