package GroupProject2;

public class ShapeTester {
    public static void main(String[] args) {

        Square square=new Square();

        System.out.println("The area of a square whose sides is length of 5 is " + square.calculateArea(5));

        System.out.println("The perimeter of a square whose sides  is length 5 is " + square.calculatePerimeter(5));

        Circle circle=new Circle();

        System.out.println("The area of a circle whose radius is of length 5 is " + circle.calculateArea(5));

        System.out.println("The perimeter of a circle whose radius is of length 5 is " + square.calculatePerimeter(5));



    }
}
