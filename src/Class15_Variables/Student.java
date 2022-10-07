package Class15_Variables;

public class Student {

    /*
   Create a Class called students
   create three variable name, id, and numberOfStudents
   create three objects of the student class
   set the value for studentName, studentID, and increment the numberOfStudents for each object
   print out total number of students.
    */
    String name;
    int id;
    static int numberOfStudent ;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "puskar";
        s1.id = 121;
        numberOfStudent++;

        Student s2 = new Student();
        s2.name = "janel";
        s2.id = 122;
        numberOfStudent++;

        Student s3 = new Student();
        s3.name = "sabah";
        s3.id = 123;
        numberOfStudent++;

        System.out.println(numberOfStudent);


    }


}

