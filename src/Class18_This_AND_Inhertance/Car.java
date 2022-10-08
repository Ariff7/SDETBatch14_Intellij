package Class18_This_AND_Inhertance;

public class Car{ //Car is called sometimes Parent class/ Super class/ base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    //if a field or method has private accesss modifier in parent class, child classes CANT USE IT
    private String vin;



    //method
    void printCarDetails(){
        System.out.println("Make is "+ make + " model is "+ model+ " and color is "+color);
    }

}

 class BMW extends Car{
   double engineSize;

}

//New Class in same Class

class Tesla{

}

//another new class
class Toyota{
    double EngineSize;
}

class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make="BMW";
        bmw.color="White";
        bmw.model="M5";
        bmw.engineSize=650;
        bmw.printCarDetails();



    }
}