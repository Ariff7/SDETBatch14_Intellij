package Class24_27_Review;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        Set<ArrayListDemo_Student> students=new LinkedHashSet<>(); //upcasting
        students.add(new ArrayListDemo_Student("Arif", "Aliyev", "123"));
        students.add(new ArrayListDemo_Student("Lebron ","James","6"));
        students.add(new ArrayListDemo_Student("Maga","AmirShayev","7"));
        students.add(new ArrayListDemo_Student("Russ","Westbrook","0"));

//If we don't override equals method(In ArrayListDemo_Student class) in our custom classes most of the collections framework will not work properly with those classes
        System.out.println(students);


        List<ArrayListDemo_Student>setStudent=new ArrayList<>(students);  //converting set to a list
        System.out.println(setStudent.get(1));




                     // students.get(2);   --will not work in Sets
    }
}
