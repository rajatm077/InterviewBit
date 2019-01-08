    /**
     * Created by MalhotR1 on 03/28/2018.
     */

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;

    public class MatrixSearch {
        public static void main(String[] args) throws IOException {
            int A = -1146467285;
            int res = 0;
            boolean isNegative = false;
            if (A < 0) {
                isNegative = true;
                A = -A;
            }
            while (A > 0) {
                res = res * 10;
                res = res + A % 10;
                A = A / 10;
            }
            if (res  < 0) System.out.println(0);
            else if (isNegative) System.out.println(-res);
            else System.out.println(res);

        }

    }
