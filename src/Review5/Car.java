package Review5;

interface Drivable {

    //by default all variables public static final
    boolean DRIVES=true;

    //we cannot have a constructor

    //by default all methods are public abstract
    void breaks();
}

interface Vehicle {

    void haveMotor();

    //from java 8 we can have static and default methods
    default void haveBreak() {
        System.out.println("All vehicle have break");
    }

    static void honk() {
        System.out.println("all vehicles honk");
    }
}

public abstract class Car {

    String color, make, model;
    public static final int WHEELS=4;

    public Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }

    void drive(){
        System.out.println("All cars can drive");
    }

   abstract void startUp();

   abstract void stop();
}

class Tesla extends Car implements Drivable, Vehicle {   //Class 'Tesla' must either be declared abstract or implement abstract method 'startUp()' in 'Car'
                           //if you dont use abstract

    public Tesla(String make, String model, String color) {
        super(make, model, color);
    }

    @Override
    void startUp() {

        System.out.println("To start "+make+" Press start button while holding break");
    }

    @Override
    void stop() {
        System.out.println("To stop "+make+" let go off gas pedal, and it will break itself");
    }

    public void charge(){

        System.out.println("You need to charge Tesla's instead of using gasoline ");
    }

    public void breaks() {
        System.out.println(make+" can break");
    }

    public void haveMotor() {
        System.out.println(make +" have motor");
    }

    public void haveBreak() {

    }
}

class TestCars{
    public static void main(String[] args) {
        Car tesla = new Tesla("tesla","Model x","white");

        Tesla tesla1=new Tesla("tesla","Model x","white");

        tesla.startUp();
        tesla.drive();
        tesla.stop();

        //    tesla.charge();   --will not be accesibale, need to use TESLA

        tesla1.charge();

        // new Car(); not possible because Car is abstract class


    }
}
