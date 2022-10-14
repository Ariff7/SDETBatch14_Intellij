package Class19_Super_keyword_AND_Inheratance;

public class Dog extends  Animal{

    public Dog(String name, String breed, String color){
        super(name, breed, color);
    }


}

class Cat extends  Animal{

    Cat(String name, String breed, String color){
      super(name, breed, color);
    }

}

class TestAnimal{
    public static void main(String[] args) {
        Dog dog=new Dog("Johnny", "Pitbull", "black");
        dog.printInfo();
    }
}
