package Class13_String_Methods_;

public class ALL_String_Methods {
    public static void main(String[] args) {

        String textFromApplication="Enroll today  ";
        String textFromUseStory="Enroll today";
        if (textFromApplication.trim().equals(textFromUseStory)){
            System.out.println("text is matched test pass");
        }else {
            System.out.println("text is not matched");
        }
        // trim() returns a string whose value is the string , with any leading
        System.out.println(textFromApplication.trim());
        // Substring
        String str="Hello class";
        String part2=str.substring(6);
        System.out.println(part2);
        // get the word hello
        String part1 =str.substring(0,5);
        System.out.println(part1);
        //concat to bring back our
        String newString=part1.concat(part2);
        System.out.println(newString);

        //or we can use
        System.out.println(part1+part2);

        // some examples
        char single= newString.substring(6).charAt(0);
        System.out.println(single);
//newString.charAt(0).substring(6); compiler error/
        //
//replace()

        String myString="Today is September";
        myString=myString.replace("September","October");
        System.out.println(myString);
        myString=myString.replace('T','t');//replace
        System.out.println(myString);

// split(); cut out the string

        String myStr="today is a review class";
        String[]array=myStr.split(" ");
        System.out.println(array.length);
        System.out.println(array[3]);
        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
// other way
        for(String arr:array) {
            System.out.println(arr);
        }



    }
}
