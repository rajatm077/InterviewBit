/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) throws IOException {
        int[] heights = new int[] {2,1,5,6,2,3};
        Stack<Integer> stk = new Stack<>();
        int temp = 0;
        int min_h = heights[0];
        int largest = heights[0];
        stk.push(heights[0]);
        for (int i = 1; i < heights.length; i++) {
            int h = stk.peek();
            if (h > heights[i]) {
                min_h = heights[i];
                temp = 0;

            } else {
                stk.push(heights[i]);
                temp += min_h;
                if (temp > largest) largest = temp;
            }
        }

    }

}
