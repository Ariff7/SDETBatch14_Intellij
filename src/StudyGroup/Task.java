package StudyGroup;

public class Task {
    /*
    Task
    Given an integer,'n', perform the following conditional actions:
    If 'n' is odd, print Weird
    If 'n' is even and in the inclusive range of 2 to 5, print "Not Weird"
    If 'n' is even and in the inclusive range of 6 to 20 , print "Weird"
    If 'n' is even and greater than 20, print "Not Weird"
    NOTE: TRY TO SOLVE USING CONSTRUCTOR AND METHOD WHICH WE JUST LEARN. YOU CAN CREATE OBJECT IN SAME CLASS.
     */


    int n;

    Task(int n){
        this.n=n;
    }

    void display(){
        if(n>=6 && n<=20){
            System.out.println("Weird");
        }
        if(n%2==0){
            System.out.println("Weird");
        }
    }

}
