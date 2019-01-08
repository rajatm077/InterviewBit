/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxArrayList {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//            String[] in = br.readLine().trim().split(" ");
            int[] A = {49, -24, -49, 56, -26, 78, 25, -100, -73, 31 };
            int max = Integer.MIN_VALUE;
            int temp = Integer.MIN_VALUE;
            int length = A.length;
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j < length; j++) {
                    temp = Math.abs(A[i] - A[j]) + Math.abs(j - i);
                    if (temp > max) max = temp;
                }

            }
            System.out.println(max);
        }
    }

}
