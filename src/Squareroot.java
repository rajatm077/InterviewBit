/**
 * Created by MalhotR1 on 04/13/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Squareroot {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine().trim());
            for (int t = 0; t < T; t++) {
                int N = Integer.parseInt(br.readLine().trim());
                long res = (long)N * N;
                int low = 0;
                int high = N;
                int mid = (low + high) /2;
                while (low < high) {
                    long square = (long) mid * mid;
                    if (square ==  res) {
                        System.out.println(mid);
                        break;
                    } else if (square > N) {
                        high = mid;
                    } else low = mid;

                    int temp = (low + high) / 2;
                    if (temp == mid) {
                        System.out.println(mid);
                        break;
                    } else mid = temp;
                }
            }
        }
    }

}
