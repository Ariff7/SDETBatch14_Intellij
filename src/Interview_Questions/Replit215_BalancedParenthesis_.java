package Interview_Questions;

/*
It contains no unmatched brackets.
The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
Given  strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return true. Otherwise, return false.

Complete the function isBalanced in the editor below.

isBalanced has the following parameter(s):

string s: a string of brackets
Returns

string: either true or false
 */
/*
input "(()"  ->  false
input "("  ->  false
input ")"  ->  false
input "(()))"  ->  false
input "(())"  ->  true
input "()"  ->  true
input ")()("  ->  true
 */
public class Replit215_BalancedParenthesis_ {
    public static void main(String[] args) {

        System.out.println(isBalanced("("));

    }

    public static boolean isBalanced(String str) {

        char[] arr = str.toCharArray();
        int open = 0;
        int close = 0;

        for (char c : arr) {
            if (c == '(') {
                open++;
            } else if
                (c == ')') {
                    close++;
                }
            }
            if (open == close) {
                return true;
            } else {

                return false;
            }
        }
    }
