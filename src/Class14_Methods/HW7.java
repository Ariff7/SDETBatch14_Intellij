package Class14_Methods;

public class HW7 {

 //Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F

    void Grade(int num){

        if(num>=90 && num<=100){
            System.out.println("Your grade is : A");
        }  if(num>=80 && num<=89){
            System.out.println("Your grade is : B");
        }  if(num>=70 && num<=79){
            System.out.println("Your grade is : C");
        }  if(num>=60 && num<=69){
            System.out.println("Your grade is : D");
        }  if(num>=50 && num<=59){
            System.out.println("Your grade is : F");
        }else{
            System.out.println("Invalid score");
        }
    }

    public static void main(String[] args) {
        HW7 letter=new HW7();
        letter.Grade(-21);
    }

}
