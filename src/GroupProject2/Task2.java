package GroupProject2;

public abstract class Task2{
    /*
     We have to calculate the average of marks
obtained in three subjects by student A and by
student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning
the average percentage of marks. Provide
implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
marks in three subjects as its parameters and
the marks in four subjects as its parameters for
student B. Test your code

     */
    public static void main(String[] args) {

        A a= new A(80,80,85);
        a.getPercentage();

        B b=new B(90,90,90,99);
        b.getPercentage();

    }
}

abstract class Marks{
    double subject1;
    double subject2;
    double subject3;

    Marks(double subject1, double subject2, double subject3){
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    abstract void getPercentage();
}

class A extends Marks{

    A(double subject1, double subject2, double subject3) {
        super(subject1, subject2, subject3);
    }

    @Override
    void getPercentage() {
        System.out.println("Average score for 3 subjects is "+(subject1+subject2+subject3)/3);
    }
}

class B extends Marks{

    double subject4;

    B(double subject1, double subject2, double subject3, double subject4) {
        super(subject1, subject2, subject3);
        this.subject4=subject4;
    }

    @Override
    void getPercentage() {
        System.out.println("Average score for 3 subjects is "+(subject1+subject2+subject3+subject4)/4);

    }
}


