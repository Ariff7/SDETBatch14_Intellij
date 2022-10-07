package Class14_Methods;

public class HW7_RightWay {

    char getGrade(int score){
        char grade;
        if(score>90){
            grade='A';
        }else if( score>80){
            grade='B';
        }else if(score>70){
            grade='C';
        }else if(score>50){
            grade='D';
        }else {
            grade='F';
        }
        return grade;
    }

    public static void main(String[] args) {
        HW7_RightWay task7=new HW7_RightWay();
        System.out.println(task7.getGrade(81));

    }
}
