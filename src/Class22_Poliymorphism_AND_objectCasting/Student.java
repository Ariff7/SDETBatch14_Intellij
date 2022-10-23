package Class22_Poliymorphism_AND_objectCasting;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {
    public void print(){
        System.out.println("Studying to have a better life");
    }
}

class SyntaxStudent extends Student{
    String hobby;

    @Override
    public void print() {
        System.out.println("Studying to get that 100k a year");
    }
    public void coding(){
        System.out.println("LOVESS to code");
    }
}

class CollegeStudent extends Student{
    @Override
    public void print() {
        System.out.println("Studying for their major");
    }
    public void party(){
        System.out.println("Loves to party");
    }
}

class SchoolStudent extends Student{
    @Override
    public void print() {
        System.out.println("Studying to become the BEST SCHOOL STUDENT");
    }
    public void study(){
        System.out.println("Studys alll day, erryyday");
    }
}

class StudentTester{
    public static void main(String[] args) {
        Student[]students={new SyntaxStudent(),new CollegeStudent(), new SchoolStudent()};
        for(Student display:students){
            display.print();
        }
    }
}
