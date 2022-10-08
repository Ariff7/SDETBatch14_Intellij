package StudyGroup;

import Class17_Constructors.Task3;

public class task3_diffPackage {
    public static void main(String[] args) {

      Task3 person=new Task3(21);
        System.out.println(person.ageInfo());

        //or

        String AgeResult= person.ageInfo();
        System.out.println(AgeResult);



    }

}
