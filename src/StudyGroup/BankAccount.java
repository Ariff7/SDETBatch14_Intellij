package StudyGroup;

public class BankAccount {

    private String userName;
   private  String passWord;
    String accountType;
    double balance;
    double TransferMoney;
    boolean isCredit;
    String result="";

    //constructor
    public BankAccount(String customerName, String customerPassWord){
        userName=customerName;
        passWord=customerPassWord;
    }

    public BankAccount(String customerAccountType, double customerBalance, double customerTransferRemain){
        accountType=customerAccountType;
        balance=customerBalance;
        TransferMoney=customerTransferRemain;

    }

    public String login (String confirmPass){
        if(!userName.isEmpty()){
            if(passWord.equals(confirmPass)){
                result =" You have successfully logged in";
            }else{
                result= "youre password does not match";
            }
        }
       return result;
    }

    public void TransferMoney(String nextAccountType){
        double remain;
        if(!accountType.equalsIgnoreCase(nextAccountType)){
            if(TransferMoney<balance){
                remain=balance-TransferMoney;
                System.out.println("You have successfully transfered "+ TransferMoney
                + " your remaining balance is "+remain);
            }else{
                System.out.println("You do not have enough funds");
            }
        }else{
            System.out.println("You cannot send money to same account type");
        }
    }
}
