import java.util.*;
import java.lang.*;
import java.io.*;

public class elitmus2 {
    public static void printArr(int[] arr) {
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arrCpy[] = new int[n];
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arrCpy[i] = arr[i];
            minQ.add(arr[i]);
            maxQ.add(arr[i]);
        }
        Arrays.sort(arrCpy);
        // printArr(arr);
        if (Arrays.equals(arr, arrCpy)) {
            System.out.println("-1 -1");
            return;
        }
        int start = 0;
        int end = n - 1;
        for (int i = 0; i < n; i++) {
            int qMin = minQ.poll();
            if (arr[i] != qMin) {
                start = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            int qMax = maxQ.poll();
            if (arr[i] != qMax) {
                end = i;
                break;
            }
        }
        System.out.println((start + 1) + " " + (end + 1));
    }
}
