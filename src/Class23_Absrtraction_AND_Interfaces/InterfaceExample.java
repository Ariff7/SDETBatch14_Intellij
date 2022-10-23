package Class23_Absrtraction_AND_Interfaces;

interface waterBottle{
    String color="BLUE";

    void FillUp();
    void PourOut();

}


public class InterfaceExample implements waterBottle{
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex=new InterfaceExample();
        ex.FillUp();
        ex.PourOut();

    }

    @Override
    public void FillUp() {
        System.out.println("It is filled");

    }

    @Override
    public void PourOut() {
        System.out.println("All poured out :( ");

    }
}
