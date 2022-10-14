package Class19_Super_keyword_AND_Inheratance;

public class Furniture {
    String color="green";
}

class Chair extends Furniture{
    String color="red";

    void printColor(){
        String color="Black";
        System.out.println(color); //Local variable
        System.out.println(this.color); //instance variable from same class
        System.out.println(super.color); // prints the instance variable from parent
    }
}

class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
