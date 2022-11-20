package Interview_Questions;

//input ["aabbcca"]-> output["abca"]

public class RemoveOnlyConsecutiveDuplicates_String_Method {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("aabbcca"));
    }

    public static String removeConsecutiveDuplicates(String input) {
        if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return  removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0)+removeConsecutiveDuplicates(input.substring(1));
    }
}
