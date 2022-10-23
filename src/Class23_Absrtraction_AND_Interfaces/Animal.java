package Class23_Absrtraction_AND_Interfaces;

public abstract class Animal {
    abstract void  eat();
    abstract void sleep();

    public static void main(String[] args) {

    }
}

class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cats like fish");
    }

    @Override
    void sleep() {
        System.out.println("Cats sleep for 12-16 hours");
    }
    void showAttitude(){
        System.out.println("Meooooowwwww");
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Dogs eat bones");
    }

    @Override
    void sleep() {
        System.out.println("Dogs sleep 10 hours");
    }
}
