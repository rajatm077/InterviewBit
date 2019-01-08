/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimplifyPath {
    public static void main(String[] args) throws IOException {
        String path = "/.";
        String[] str = path.split("/");
        ArrayList<String> stk = new ArrayList<>();
        int top = 0;
        stk.add(top++, "/");

        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                if (str[i].equals(".")) continue;
                else if (str[i].equals("..")) {
                    if (top > 1) top-= 2;
                    else top = 1;

                } else {
                    stk.add(top++, str[i]);

                    stk.add(top++, "/");
                }
            }
        }

//        if (top == 1) return "/ ";
        for (int i = 0; i < top - 1; i++)
            System.out.print(stk.get(i));


    }
}


