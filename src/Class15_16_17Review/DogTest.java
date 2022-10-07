package Class15_16_17Review;

public class DogTest {

    public static void main(String[] args) {

        //how to access static variable
        Dog.breed="Husky";

        Dog dog1=new Dog();
        //object^^^
        //How to access instance variables

        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Tim";
        dog2.weight=10;
        dog2.printInfo();

        System.out.println("--MAKING CHANGES---");
        dog1.name="Bobik";
        dog1.breed="German Sherpherd";

        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        float price2=dog2.getPrice();
        System.out.println(price2);

  //1 way
        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

//2nd way
        String typeOfBark= dog1.bark();
        System.out.println(typeOfBark);

  // with parameter ()
         dog1.love(" To Jump");
         dog2.love("To Play");

    }
}
