package Class14_Methods;

public class HW5 {

    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com

    String createEmail(String firstName,String lastName,String emailType){

        return (firstName+lastName+"@"+emailType+".com").toLowerCase();
    }

    public static void main(String[] args) {
        HW5 mail=new HW5();
        String fullEmail=mail.createEmail("John","Snow","gmail");
        System.out.println(fullEmail);
        System.out.println(mail.createEmail("Niazi","Zamir","outlook"));

    }
}
