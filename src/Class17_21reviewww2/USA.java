package Class17_21reviewww2;

import Class17_21_reviewww.Country;

public class USA extends Country {
    USA(String name){
        super(name);
    }
    public static void main(String[] args) {

        USA usa = new USA("USA");
        usa.name="USA";
        usa.capital="Washington DC";

    }
}
