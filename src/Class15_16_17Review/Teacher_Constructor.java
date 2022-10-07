package Class15_16_17Review;

public class Teacher_Constructor {

    String name, lasttName;
    int experience;
    String subject;
    double salary;

    static String school;

    // -- HOW TO CREATE CONSTRUCTOR
    //       -NO return type (not even void)

    //Using below constructor we initialize the instance variables(name,lastName)

    Teacher_Constructor(String FirstName, String LastName){
        name=FirstName;
        lasttName=LastName;
    }

    /*
    When you create a contructor
      -compiler is NOT going to create a default constructor
     */

    void print(){
        System.out.println(name+" "+lasttName);
    }

}
