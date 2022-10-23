package Class24_ArrayList_And_Setter_Getter_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class task1_difway {
    public static void main(String[] args) {
        ArrayList<String>names =new ArrayList<>(Arrays.asList("Ben", "Billy", "john","Steve"));
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ben"));
        System.out.println(names.contains("Arif"));
        System.out.println(names.size());
        names.forEach(System.out::println);
    }
}
