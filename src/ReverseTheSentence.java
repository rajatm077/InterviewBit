/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTheSentence {
    public static void main(String[] args) throws IOException {
        String[] in = "the sky is blue".split(" ");
        String out = "";
        for (int i = in.length - 1; i >= 0; i--) {
            out += in[i] + " ";
        }
        System.out.println(out.trim());

    }

}
