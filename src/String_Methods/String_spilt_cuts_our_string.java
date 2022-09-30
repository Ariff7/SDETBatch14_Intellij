package String_Methods;

public class String_spilt_cuts_our_string {
    public static void main(String[] args) {


        String mystr = "Today is a review class";
        String[] arr = mystr.split(" ");
        System.out.println(arr.length);//5
        System.out.println(arr[4]);//review
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("------");
        //other way
        for (String array : arr) {
            System.out.print(array+ " ");
        }
    }
}

