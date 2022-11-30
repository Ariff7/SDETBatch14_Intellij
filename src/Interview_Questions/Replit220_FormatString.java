package Interview_Questions;
/*
Format the String:
Write the logic to format the string in the below given format
xxx-xxx-xxx
after each 3 digits ther should be dash("-")
if there are any spaces in the input remove those

input ["00-44   48 555555"]
output ["004-448-555-555"]
input ["00-44   48 555"]
output["004-448-555"]
input ["00-44  #$% 48 55"]
output ["004-448-55"]

 */
public class Replit220_FormatString {
    public static void main(String args[]) {
        System.out.println(formatString("00-44  #$% 48 55")); //004-448-55

        System.out.println(formatString("00-44   48 555555")); //004-448-555-555

    }

    public static String formatString(String S){

        String format="";
        String newFormat = "";
        int j=3;
        String newWord = S.replaceAll("[^0-9]","");
        int length = newWord.length();
        for(int i=0;i<length;i+=3){
            if(j<length){
                newFormat = newWord.substring(i, j);
                format += newFormat + "-";
                j+=3;
            }else{
                format+=newWord.substring(i,length);
            }

        }
        return format;
    }
}
