package Class13_String_Method_HWS;

public class task3_HowManySentencesIn_a_String {
    public static void main(String[] args) {

        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        //       How would you find out how many sentences are in that String

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";

        //alt enter to convert to array

        String[] sentences = str.split("[?]");
        System.out.println(sentences.length);

    }
}
