package Class18_This_AND_Inhertance;

public class Animal {

    String name;
    String breed;
    int age;
    double weight;

    //for Horse
    void printInfo(){
        String name="now this will be printed";
        System.out.println("name "+this.name+" Breed "+breed+" age "+age+" Weight "+weight);
    }

}
