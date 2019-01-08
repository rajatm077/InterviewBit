/**
 * Created by MalhotR1 on 03/27/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class KSmallest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());
            String[] in = br.readLine().trim().trim().split(" ");
            int k = Integer.parseInt(br.readLine().trim());

            int[] arr = new int[N];
            for (int i = 0; i < in.length; i++) {
                arr[i] = Integer.parseInt(in[i]);
            }

            int heapSize = arr.length;
            for (int i = arr.length / 2 - 1; i >= 0; i--) {
                BuildMinHeap(arr, i, heapSize);
            }

            for (int i = 0; i <k-1; i++) {
                arr[0] = arr[heapSize - 1];
                heapSize--;
                BuildMinHeap(arr, 0, heapSize);
            }
            System.out.println(arr[0]);
        }
    }

    private static void BuildMinHeap(int[] arr, int i, int heapSize) {
        int smallest = i;
        int left = 2*i+1;
        int right = left + 1;
        if (left < heapSize && arr[left] < arr[i]) smallest = left;

        if (right < heapSize && arr[right] < arr[smallest]) smallest = right;
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            BuildMinHeap(arr, smallest, heapSize);
        }

    }

}

