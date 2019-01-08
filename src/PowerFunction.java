/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerFunction {
    public static void main(String[] args) {
        int x = 71045970;
        int n = 41535484;
        int d = 64735492;
        long res = calPow(x, n, d);
        System.out.println(res);

    }

    private static long calPow(long x, int n, int d) {
        if (n == 1) return x;
        long val = x*x;

        if (n % 2 == 0) {
            if (val % d == 0) return 0;
            else return calPow(val, n / 2, d);
        }
        else {
            val = x * calPow(val, n / 2, d);
            if (val % d == 0) return 0;
            else return val;
        }
    }
}