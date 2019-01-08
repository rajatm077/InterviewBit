/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CloseParanthesis {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String in = br.readLine().trim();
            char[] arr = in.toCharArray();
            Stack<Character> stk = new Stack<>();
//            ArrayList<String> al = new ArrayList<>();
//            al.add(0, "hello");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
                    stk.push(arr[i]);

                else {

                    char c = stk.pop();
                    if ((c == '(' && arr[i] == ')') || (c == '{' && arr[i] == '}')
                            || c == '[' && arr[i] == ']') continue;
                    else {
                        System.out.println("not balanced");
                        return;
                    }
                }
            }
            if (!stk.empty()) {
                System.out.println("not balanced");
//                return;
            } else {
                System.out.println("balanced");
            }
        }
    }

}
