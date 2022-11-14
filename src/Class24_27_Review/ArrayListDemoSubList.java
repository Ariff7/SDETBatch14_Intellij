package Class24_27_Review;

import java.util.ArrayList;

public class ArrayListDemoSubList {


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

        System.out.println(animals.subList(0,3)); //[Dog, Cat, Lion]



    }
}