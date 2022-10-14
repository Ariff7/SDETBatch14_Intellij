package Class20_MethodOverLoading;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */

   static void name(String player, int points){
       System.out.println(player+" had "+points+" points");
   }
   static void name(String player, int points, int rebound){
       System.out.println(player+" had "+points+" points "+ " and "+rebound+"rebounds");
   }
   static void name(int points, String player){
       System.out.println(player+ " had "+ points+" points!!");
   }

    public static void main(String[] args) {

       name(21,"Arif");
       // Task3 bb= new Task3();
        //bb.name("Billy ", 30);
       // bb.name("Johny ",10,11);
       // bb.name(32,"Russell");
    }
}

