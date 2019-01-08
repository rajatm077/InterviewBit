/**
 * Created by MalhotR1 on 03/28/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateNumbers {
    public static void main(String[] args) throws IOException {
        List<Integer> al2 = new ArrayList<>();

       int[] arr = {31, 6, 8, 12, 22, 27, 1, 30, 11, 28, 36, 18, 17, 16, 24, 10, 21, 23, 2, 32, 33, 3, 9, 15, 13, 14, 23, 4, 20, 5, 34, 26, 19, 7, 25, 35, 29};
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int index = (int) Math.abs(arr[i]);
            if (arr[index] < 0) {
                System.out.println(-arr[i] + " ");
            }
            else {
                arr[index] = -arr[index];
//                al.set(index, t);
            }
        }
    }

}
