package Class17_21_reviewww;

public class Teacher {

    //fields && instance variables

    public String name, lastName;
    protected String subject;
    int experience;
    private double salary;
    public static String school;

    //constructor
   public Teacher(String name, String lastName){
        this.name=name;    //this. refers to the current object: instance variables & instance methods   - //local assigned to instance
        this.lastName=lastName;


    }

    public Teacher(String name, String lastName, String subject){
        this(name, lastName);      //this()-refers to the current obkect : current class constructor
        this.subject=subject;
    }

    Teacher(String name, String lastName, int experience){
        this(name, lastName);
        this.experience=experience;
    }

    //methods

   public  static void work(){
        System.out.println("All teachers work at "+school);
    }

     public void print(){
        System.out.println("Teacher name is "+name+" "+lastName);
    }

    public void teach(){
        this.print();
        System.out.println(name+" teaches "+ subject);
    }

    //calculate method based on experience and return result;

    private double bonus(){
        if(experience<5){
            return 3;
        }else{
            return 3.5;
        }
    }

}


class School{
    public static void main(String[] args) {
        Teacher t1=new Teacher("Arif","Aliyev");   //refernce variable


        Teacher t2=new Teacher("Perry", "Davidson", "math");
        t2.teach();



        Teacher t3= new Teacher("Asghar","billison",7);

        Teacher.school="Syntax";
        Teacher.work();

        t3.print();
        t3.teach();
       // t3.getBonus(); //-private, not accessiable

    }
}
