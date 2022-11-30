package Interview_Questions;
/*
Find the largest even length word from a String
if there are two words with same largest even length return the first one.
if there are not even words return -1

input ["find MaxLen Even"]

output ["MaxLen"]

input["I am very Good at Java"]

output ["very"]

input["I was"]

output ["-1"]
 */

public class Replit221_FindLargestEvenLengthString {
    public static void main(String[] args) {

        System.out.println(findMaxLenEven("find MaxLen Even"));

    }


    public static String findMaxLenEven(String str) {
        int largest=0;
        String largestWord="";
        String[]individualWord=str.split(" ");
        for(String word:individualWord){
            if (word.length()>largest){
                largest=word.length();
                largestWord=word;
            }
        }

        return largestWord;
    }
}
