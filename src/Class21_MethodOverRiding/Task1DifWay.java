package Class21_MethodOverRiding;

public class Task1DifWay {
    /*
    Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.
     */
    public static void main(String[] args) {
        Degree2 d2=new Degree2();
        d2.getPrerequisite();

        Bachelors2 b2=new Bachelors2();
        b2.getPrerequisite();

        Masters2 m2= new Masters2();
        m2.getPrerequisite();
    }

}
class Degree2{
    void getPrerequisite(){
        System.out.println("To get a degree you need high school dimploma");
    }
}

class Bachelors2 extends Degree2{

}
class Masters2 extends Bachelors2{
    @Override
    void getPrerequisite() {
        System.out.println("To get a Master's degree you need Bachelors");
    }
}