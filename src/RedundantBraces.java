/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class RedundantBraces {
    public static void main(String[] args) throws IOException {
        String A = "(a)";
        System.out.println(braces(A));
    }

    public static int braces(String A) {
        char[] str = A.toCharArray();
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ')') {
                char c = stk.peek();
                if (c == '(') return 1;
                while (c != '(' && !stk.empty()) {
                    c = stk.pop();

                }
            }
            else if (str[i] == '+' || str[i] == '*' || str[i] == '-' || str[i] == '/' || str[i] == '(') {
                stk.push(str[i]);
            }
        }
        return 0;
    }
}
