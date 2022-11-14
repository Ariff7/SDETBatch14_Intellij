package Class24_27_Review;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> animals =new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");



        System.out.println(animals); //[Dog, Cat, Lion, Monkey, Tiger, Panda, Horse]

        //Print the size of each word from this list?

        for(String animal: animals){
            System.out.println(animal+ " length is "+animal.length()); //Dog length is 3
        }

        //Remove word if word is more than 4 characters

        animals.removeIf(x->x.length()>4);
       System.out.println(animals); //[Dog, Cat, Lion]





    }
}
