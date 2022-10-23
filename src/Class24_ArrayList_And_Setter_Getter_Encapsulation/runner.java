package Class24_ArrayList_And_Setter_Getter_Encapsulation;

 class asda {

     private String empName;
     private int empAge;

     public String getEmpName() {
         return empName;
     }

     public void setEmpName(String empName) {
         System.out.println("Employee Name: "+empName);
     }

     public int getEmpAge() {
         return empAge;
     }

     public void setEmpAge(int empAge) {
         System.out.println("Employee Age: "+empAge);
     }
 }


    public class runner {
        public static void main(String[] args) {
            asda run= new asda();

            run.setEmpName("John");
            //System.out.println(run.getEmpName());

            run.setEmpAge(30);
            // System.out.println(run.getEmpAge());

        }
    }

