package StudyGroup;
/*
     Write a program  that creates a class named as Encode that has one method named as EncodeString
     (int offset, String word).
     This function would encode or encrypt the given word, for example
     if words is abc and offset is 2, so we get cdf as string in return
    create one instance array to store alphabets from a to z
    */
// question from a micstroft interview

public class practice {
   private String empName;
   private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
class test{
    public static void main(String[] args) {
        practice p1=new practice();
        p1.setEmpName("John");
        System.out.println(p1.getEmpName());


    }
}
