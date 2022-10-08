package Class17_Constructors;

public class Task3 {
   // Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.

   private String firstName;
   private  String lastName;
   private  int age;
   private  double height;
   private double weight;
   private boolean isEducated;


    //constructor using private

    private Task3(String Fname, String Lname){
        firstName=Fname;
        lastName=Lname;
    }
    //constructor using public
    public Task3(int userAge){
        age=userAge;
    }
    //default constructor
    Task3(double userHeight, double userWeight, boolean isUserEducated){
        height=userHeight;
        weight=userWeight;
        isEducated=isUserEducated;
    }
    //protected constructor
    protected Task3(){

    }

    //method
    private void info(){
        System.out.println(firstName+lastName);
    }

   public void printInfo(){
        if(isEducated){
            System.out.println("height :" +height+" weight :"+weight);
        }else{
            System.out.println("get educated lol");
        }
    }

    public String ageInfo(){
        if(age<=19 && age>=13){
            return "Youve become teenager";
        }else{
            return "Not a teenager ";
        }
    }

    public static void main(String[] args) {
//private constructor
     Task3 person= new Task3("billy"," boi");

        person.info();
    }

}
