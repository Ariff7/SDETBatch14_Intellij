package Class22_Poliymorphism_AND_objectCasting;

public class Task1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    Define common behavior within parent class and override some of the methods in child classes
    Define some methods specific to child classes.
    Write example of achieving run time polymorphism.
     */

    public static void main(String[] args) {
        Student1[]arr={new CollegeStudent1(), new SchoolStudent1(), new SyntaxStudent1()};

        for(Student1 students:arr){
            students.study1();
            students.doHomeWork();
            students.doPractice();
        }

    }
}
class Student1{
    void study1(){
        System.out.println("Students must study");
    }
    void doHomeWork(){
        System.out.println("Student must solve their homeworks");
    }
    void doPractice(){
        System.out.println("Students must practice to get good grades");
    }
}
class SyntaxStudent1 extends Student1{
    @Override //same method in parent
    void doHomeWork() {
        System.out.println("Syntax student must solve all the repls ");
    }

    @Override
    void doPractice() {
        System.out.println("Syntax student must do their own research and practice");
    }
}
class CollegeStudent1 extends Student1{
    @Override
    void doPractice() {
        System.out.println("College student barely practice :/ ");
    }
}
class SchoolStudent1 extends Student1{

}

