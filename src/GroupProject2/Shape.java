package GroupProject2;

public interface Shape {
/*
Create an Interface 'Shape' with undefined
methods as calculateArea and
calculatePerimiter. Create 2 classes Circle &
Square that implements functionality defined in
the Shape Interface. Test your code.

 */
 double calculateArea(int a);
 double calculatePerimeter(int a);

}

class Circle implements Shape{

    @Override
    public double calculateArea(int radius) {
        return (3.14* radius *radius);
    }

    @Override
    public double calculatePerimeter(int radius) {
        return 2 * 314 *radius;
    }
}

class Square implements Shape{

    @Override
    public double calculateArea(int sideLengthOfSquare) {

        return sideLengthOfSquare * sideLengthOfSquare;
    }

    @Override
    public double calculatePerimeter(int sideLengthOfSquare) {

        return sideLengthOfSquare*4;
    }
}
