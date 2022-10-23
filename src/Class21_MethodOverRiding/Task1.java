package Class21_MethodOverRiding;

public class Task1 {
  //  Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
 //   Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
  //  Call the method by creating an object of each of the three classes.
  public static void main(String[] args) {
      Degree d=new Degree();
      Bachelors b=new Bachelors();
      Masters m= new Masters();

      d.getPrerequisite();
      b.getPrerequisite();
      m.getPrerequisite();

  }

}

class Degree {

    void getPrerequisite() {
        System.out.println("To get a degree you need high school dimploma");
    }
}

class Bachelors extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println(" I have Bachelors");
    }
}

class Masters extends Degree{
    @Override
    void getPrerequisite() {
        System.out.println("I have Masters");
    }
}


