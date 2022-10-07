package Class15_16_17Review;

public class Dog {

    String name;  //instance variable
    int weight;   //instance variable

    static String breed;  //static variable

    void printInfo(){
        System.out.println("Dog features: "+name+ ","+weight+","+breed);
    }


    //with paremeters
    void love(String thing){
        System.out.println(name+ " loves "+ thing);
    }

    //HOw to declare variable
    // dataType name ex: String breed;

    //Method Syntax
    //returnType ex: void printInfo

    //create a method to return the price

    float getPrice(){
        if(weight<=5){
            return 100;
        }else if(weight<=10){
            return 200;
        }else{
            return 1000;
        }
    }

    String bark(){

        String noise;

        if(weight<=5){
            noise="LOUD";
        }else if(weight<=20){
            noise="roof roof";
        }else{
            noise="Gav Gav";
        }return noise;
    }

}
