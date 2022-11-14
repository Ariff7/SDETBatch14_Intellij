package Class24_27_Review;

import java.util.ArrayList;

public class ArrayListDemo_StudentTest {
    public static void main(String[] args) {



        ArrayList<ArrayListDemo_Student>students=new ArrayList<>();
        students.add(new ArrayListDemo_Student("Arif","Aliyev","16097"));
        students.add(new ArrayListDemo_Student("Maga","Aliyev","7777"));
        students.add(new ArrayListDemo_Student("Billy","Bob","11111"));

        System.out.println(students);

        for(ArrayListDemo_Student student: students){
            student.printName();     //method from ArrayListDemo_Student calling printName Method
        }

        ArrayListDemo_Student CheckIfSame=new ArrayListDemo_Student("Arif", "Aliyev", "16097");
        System.out.println(students.contains(CheckIfSame));
        System.out.println(CheckIfSame);
        System.out.println(students);


    }
}
