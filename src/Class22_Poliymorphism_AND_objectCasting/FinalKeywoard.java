package Class22_Poliymorphism_AND_objectCasting;

public class FinalKeywoard {
    public static void main(String[] args) {
        Phone phone=new Phone();
                                          // will not work --phone.RAM=50;
    }
}
class Phone{
    final int RAM=12;
    void takePics(){
        System.out.println("Taking pics");
    }
}

class Iphone extends Phone{


}
