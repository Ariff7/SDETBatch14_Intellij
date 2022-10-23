package Review5;

class Drink {

    void drink(){
        System.out.println("Drinking in Drink class");
    }

    //final methods cCANNOT be overriden
    protected final void enjoy(){
        System.out.println("We enjoy drinking water");
    }
}

public class Juice extends Drink{

   /* public void enjoy(){
        System.out.println("We enjoy drinking water in Juice class");
    } */
    //caanot ovverride the final method from DRINk class ^^^^^

}
