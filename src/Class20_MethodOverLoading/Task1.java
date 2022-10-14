package Class20_MethodOverLoading;

public class Task1 {
    // Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    // Rectangle
    // Square
    // //Box

    //Use separate class to test your code



void area(double l){
    System.out.println("The area of square is "+(l*l));
}
 void area(double l, double w){
    System.out.println("The area of rectangle is "+(l*w));
}
 void area(double l, double w, double h){
    System.out.println("The area of box is "+(l*w*h));
}


}
