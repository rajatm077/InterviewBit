/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix {
    public static void main(String[] args) throws IOException {
//        String[] br = new String[] {"abc", "def"};
//        String[] in = new String[]{"geeksforgeeks", "geeks", "geek", "geezer"};
        String[] in = new String[]{"apple", "ape", "april"};
        int minLength = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < in.length; i++) {
            if (in[i].length() < minLength) {
                minLength = in[i].length();
                index = i;
            }
        }

        char[] base = in[index].toCharArray();
        String out = "";
//        boolean flag = true;
        for (int i = base.length - 1; i >= 0; i--) {
            char c = base[i];
            boolean flag = true;
            for (int j = 0; j < in.length; j++) {
                if (in[j].charAt(i) != c) {
                    flag = false;
                    break;
                }
            }
            if (flag) out = c + out;
        }
        System.out.println(out);

    }

}
