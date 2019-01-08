/**
 * Created by MalhotR1 on 03/27/2018.
 */

import com.sun.org.apache.regexp.internal.RE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        String path = "/home/";
        String[] str = path.split("/");
        for (int i = 0; i < str.length; i++) {
//            if (str[i] == "")
            System.out.println(str[i]);
        }
//        String str = "abcdef";
//        str = Reverse(str.toCharArray(), str.length());
//        System.out.println(str);
    }

    private static String Reverse(char[] str, int l) {
        if (l == 0) return "";
        return "" + str[l-1] + Reverse(str, l-1);
    }

}
