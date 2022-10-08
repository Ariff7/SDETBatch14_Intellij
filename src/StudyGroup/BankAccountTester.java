package StudyGroup;

public class BankAccountTester {
    public static void main(String[] args) {


        BankAccount user = new BankAccount("Arif777", "pass123");
        String confirmpass=user.login("pass1234");
        System.out.println(confirmpass);

        BankAccount user2=new BankAccount("checking",5000, 1000);
        user2.TransferMoney("saving");


    }
}
