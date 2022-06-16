import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int sidx(int arr[]){
        for (int i=0; i<arr.length; i++) {
            if (n)
                Collections.min(Arrays.asList(num));
        }
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int i, c=0, min, minidx, t;
        ArrayList<Integer> l=new ArrayList<Integer>(arr.length);
        for (i=0; i<arr.length; i++)
            l.add(arr[i]);
        for (i=0; i<l.size()-1; i++) {
            List<Integer> sl= arrlist.subList(i+1, l.size());
            min=sl.min();
            minidx=sl.indexOf(min);
            if(l.get(i)>min){
                c++;
                t=s1.get(i);
                arr.set(i,min);
                arr.set(minidx,t);
            }
        }
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
