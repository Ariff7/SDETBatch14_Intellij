package Interview_Questions;

public class A_PRACTICE {
    public static void main(String[] args) {
        System.out.println(findMaxLenEven("Thy foo bro"));
    }

    public static String findMaxLenEven(String str) {
        int largest = 0;
        String largeWord="";
        String[] individualWord = str.split(" ");;
        for(String word:individualWord){
            if(word.length()>largest){
                largest=word.length();
                largeWord=word;
                //largeWord= String.valueOf(word.charAt(word.length()));
            }
        }
        return largeWord;

    }
}
