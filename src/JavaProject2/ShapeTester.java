package JavaProject2;

public class ShapeTester {
    public static void main(String[] args) {

     Shape [] shapes={new Circle(6),new Square(8)};

        for (Shape s:shapes
             ) {
            s.calculateArea();
            s.calculatePerimeter();
        }
    }
}
