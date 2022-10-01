package Class13_String_Methods_;

public class String_trim_removesSpaces_beginning_and_End {

    public static void main(String[] args) {

        String str = "  Enroll Today!     ";
        String textFromUserStory="Enroll Today!";

        if(str.trim().equals(textFromUserStory)){
            System.out.println("Text is mathced. Test Pass");
        } else {
            System.out.println("Text is NOT matched. Test failed");
        }

        System.out.println(str.trim());
        System.out.println(str);

    }
}
