package Interview_Questions;

import java.util.ArrayList;

public class FormatString {
    public static void main(String args[]) {
        System.out.println(formatString("Hey"));
    }


    public static String formatString(String S){

        ArrayList<String> geeklist
                = new ArrayList<String>();

        // Adding elements to ArrayList
        // using add() method
        geeklist.add("Hey");
        geeklist.add("Geek");
        geeklist.add("Welcome");
        geeklist.add("to");
        geeklist.add("geeksforgeeks");
        geeklist.add("!");

        StringBuilder str = new StringBuilder("");

        // Traversing the ArrayList
        for (String eachstring : geeklist) {

            // Each element in ArrayList is appended
            // followed by comma
            str.append(eachstring).append(",");
        }

        // StringBuffer to String conversion
        String commaseparatedlist = str.toString();

        // Condition check to remove the last comma
        if (commaseparatedlist.length() > 0)

            commaseparatedlist
                    = commaseparatedlist.substring(
                    0, commaseparatedlist.length() - 1);

        // Printing the comma separated string
        System.out.println(commaseparatedlist);
    return  commaseparatedlist;
    }
}
