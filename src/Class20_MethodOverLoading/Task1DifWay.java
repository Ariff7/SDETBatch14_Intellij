package Class20_MethodOverLoading;

public class Task1DifWay {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //
    //Use separate class to test your code
}

class AreaManager{

    void calculateArea(double length, double width){
        System.out.println(length*width);
    }
    void calculateArea(double length){
        System.out.println(length*length);
    }
    void calculateArea(double length, double width, double height){
        System.out.println(length*width*height);
    }

    public static void main(String[] args) {
        AreaManager test=new AreaManager();
        test.calculateArea(5);
        test.calculateArea(5,5);
        test.calculateArea(2,2,2);
    }


}
