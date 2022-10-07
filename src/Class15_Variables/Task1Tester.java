package Class15_Variables;

public class Task1Tester {

    public static void main(String[] args) {
        SyntaxEmployee Employee=new SyntaxEmployee();
        Employee.empId="123";
        Employee.salary=100000;

        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee Employee2=new SyntaxEmployee();
        Employee2.empId="777";
        Employee2.salary=130000;

        System.out.println(SyntaxEmployee.CEO);
    }
}
