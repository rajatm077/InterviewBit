/**
 * Created by MalhotR1 on 04/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JustifyText {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] in = {"This", "is", "an", "example", "of", "text", "justification."};
            int L = 16;
            ArrayList<String> out = new ArrayList<>();
            int wordCount = 0;
            char[] line = new char[16];
            while (wordCount < in.length) {
                int length = 0;
                int i = wordCount;
                for (; i < in.length && length <= L; i++) {
                    length += in[i].length() + 1;
                }
                wordCount = i;
                if (length > L) {
                    length = length - in[i].length() - 1;
                    wordCount--;
                }


            }
        }
    }

}
