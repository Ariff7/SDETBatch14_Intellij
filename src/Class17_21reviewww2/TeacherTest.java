package Class17_21reviewww2;

import Class17_21_reviewww.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t=new Teacher("John ", "Smith");

        Teacher.work(); //public
        ///protected is not visible in other packages UNLESS there is
        //default is not visible in other packages.

    }
}
