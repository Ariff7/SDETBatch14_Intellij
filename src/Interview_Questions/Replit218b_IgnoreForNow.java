package Interview_Questions;

import java.util.*;

public class Replit218b_IgnoreForNow {
    public static void main(String[] args) {
        List<String> names=new LinkedList<>();
        names.add("switch");
        names.add("tv");
        names.add("switch");
        names.add("tv");
        names.add("switch");
        names.add("tv");
        names.add("phone");

        List<String>listOfNames=countDeviceNames(names);
        System.out.println(listOfNames);

    }

    public static List<String> countDeviceNames(List<String> deviceNames) {

       String[]uniqueNames=new String[deviceNames.size()];
        for(int i=0; i<deviceNames.size(); i++){
            String name=deviceNames.get(i);
            boolean duplicate=false;
            for(int j=0; j<i; j++){
                if(uniqueNames[j].equals(name)){
                    duplicate=true;
                    break;
                }
            }
        }


        return deviceNames;
    }
}
