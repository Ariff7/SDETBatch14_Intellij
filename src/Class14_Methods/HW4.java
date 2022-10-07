package Class14_Methods;

public class HW4 {

    //Create a method that will say Hello in different language based on the country
    // that will passed when method is executed
    void hello(String country){

        if(country.equalsIgnoreCase("USA")){
            System.out.println("Hello");
        }else if(country.equalsIgnoreCase("Russia")){
            System.out.println("Privet");
        }else if(country.equalsIgnoreCase("Turkey")){
            System.out.println("Merhaba");
        }else if (country.equalsIgnoreCase("Japan")){
            System.out.println("Kon'Nichiwa");
        } else  {
            System.out.println("Country is not an option");
        }
    }

    public static void main(String[] args) {
        HW4 language=new HW4();
        language.hello("russia");
    }
}
