package Class21_MethodOverRiding;

public class Animal2 {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hours");
    }
}

class Panda extends Animal2{

    void eat(){
        System.out.println("Pandas eat Bamboos");
    }

    @Override
    void sleep() {
        System.out.println("Pandas sleep for 14 hours");
    }
}

class Cat2 extends Animal{

    void eat(){
        System.out.println("Cats like to eat fish");
    }
}
