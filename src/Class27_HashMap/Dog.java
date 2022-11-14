package Class27_HashMap;

import java.util.ArrayList;

public class Dog {
        private String name;
        private String color;
        private String breed;

        public Dog(String name, String color, String breed){
            this.name=name;
            this.color=color;
            this.breed=breed;
        }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return name+" Is the dogs name and breed is" +breed+ " and dogs color is "+color;
    }  // YOU NEED THIS TO PRINT DOGS (ArrayList)
}

class TestDog{
    public static void main(String[] args) {

        ArrayList<Dog>dogs=new ArrayList<>();
        dogs.add(new Dog("Tim","Black","German"));
        dogs.add(new Dog("Bully","White","BullDog"));
        dogs.add(new Dog("Kimi","Brown","German"));

         //  System.out.println(dogs);    //    [Class27.Dog@35f983a6, Class27.Dog@7f690630, Class27.Dog@edf4efb]
        System.out.println(dogs);
    }
}

