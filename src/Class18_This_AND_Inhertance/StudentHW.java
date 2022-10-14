package Class18_This_AND_Inhertance;

public class StudentHW {
  //  Write a Student class   that have instance variables name and address. C
   // create a constructor that will initialize those variables.
    //Print name & address of given  student using displayInfo method.

    String name;
    String address;



    StudentHW(String name, String address){
        this.name=name;
        this.address=address;
    }

    void DisplayInfo(){
        System.out.println("Student name is "+name+" and their address is "+address);
    }

    public static void main(String[] args) {
        StudentHW student1=new StudentHW("Arif Aliyev ", "St.Louis , Mo");
        student1.DisplayInfo();
    }
}
