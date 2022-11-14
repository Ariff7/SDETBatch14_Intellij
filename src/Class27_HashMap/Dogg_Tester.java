package Class27_HashMap;

import java.util.ArrayList;

public class Dogg_Tester {
    public static void main(String[] args) {
        ArrayList<Dogg> dogs = new ArrayList<>();
        Dogg dog1 = new Dogg("Tomy", "Black", "German");
        Dogg dog2 = new Dogg("Jony", "White", "BullDog");
        Dogg dog3 = new Dogg("Kimi", "Brown", "German");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        /*dogs.add(new Dog("Tomy", "Black", "German"));
        dogs.add(new Dog("Jony", "White", "BullDog"));
        dogs.add(new Dog("Kimi", "Brown", "German"));*/



        // System.out.println(dogs);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
