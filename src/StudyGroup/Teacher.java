package StudyGroup;

public class Teacher {
    /*
  Write a Java program called Teacher.  Identify features and behaviour of that Class.
  Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
  it their own features and behaviour. Test all 4 classes
   */
    String name;
    int ID;
    String subject;
    int age;

    public Teacher(String name, int ID, String subject, int age) {
        this.name = name;
        this.ID = ID;
        this.subject = subject;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name "+name +" ID " +ID + " Subject " + subject + " Age " + age);
    }
}
class MathTeacher extends Teacher{
    String country;
    public <string> MathTeacher(String name, int ID, String subject, int age, string country) {
        super(name, ID, subject, age);
        this.country= (String) country;
    }
    void display(){
        System.out.println("Name "+name +" ID " +ID + " Subject " + subject + " Age " + age+ " Country " + country);
    }
}
class ChemistryTeacher extends Teacher{
    int year;
    public ChemistryTeacher(String name, int ID, String subject, int age, int year) {
        super(name, ID, subject, age);
        this.year=(int) year;
    }
    void display(){
        System.out.println("Name "+name +" ID " +ID + " Subject " + subject + " Age " + age+ " Year " + year);
    }
}
class PianoTeacher extends Teacher {
    int salary;

    public PianoTeacher(String name, int ID, String subject, int age, int salary) {
        super(name, ID, subject, age);
        this.salary = (int) salary;
    }

    void print() {
        System.out.println("Name " + name + " ID " + ID + " Subject " + subject + " Age " + age + " Salary " + salary);
    }

    static class TestTeacher {
        public static void main(String[] args) {
            MathTeacher obj = new MathTeacher("Alex", 123, "Math", 30, "Ukraine");
            obj.printInfo();
            ChemistryTeacher obj1 = new ChemistryTeacher("Adam", 456, "Chemistry", 37, 5);
            obj1.display();
            PianoTeacher obj2 = new PianoTeacher("Mia", 789, "Piano", 32, 180000);
            obj2.print();
        }
    }
}



