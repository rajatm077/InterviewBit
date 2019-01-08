/**
 * Created by MalhotR1 on 03/31/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] A = {0,1,2};
            int target = 100;
            int index = -1;
            Arrays.sort(A);
                int mindiff = Integer.MAX_VALUE;
                for (int i = 0; i < A.length; i++) {
                    int temp = Math.abs(target - A[i]);
                    if (temp < mindiff) {
                        mindiff = temp;
                        index = i;
                    }
                }

                // target -= A[index];

                int sol = 0;
                int sum = 0;
                int start = 0;
                int end = A.length - 1;
                mindiff = Integer.MAX_VALUE;
                while (start < end) {
                    if (start == index) {
                        start++;
                        continue;
                    }
                    if (end == index) {
                        end--;
                        continue;
                    }
                    sum = A[index] + A[start] + A[end];
                    int temp = target - sum;
                    if (temp < mindiff){
                        mindiff = temp;
                        sol = sum;

                    }
                    if (temp > 0) start++;
                    if (temp < 0) end--;
                }

            System.out.println(sol);
        }
    }

}
