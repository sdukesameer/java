import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER_ARRAY h1
     * 2. INTEGER_ARRAY h2
     * 3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i < Math.max(Math.max(h1.size(), h2.size()), h3.size()); i++) {
            if (i < h1.size())
                s1 += h1.get(i);
            if (i < h2.size())
                s2 += h2.get(i);
            if (i < h3.size())
                s3 += h3.get(i);
        }
        while (!(s1 == s2 && s1 == s3 && s2 == s3)) {
            // System.out.println(s1+" "+s2+" "+s3);
            if (s1 > s2 || s1 > s3) {
                s1 -= h1.get(0);
                h1.remove(0);
                continue;
            }
            if (s2 > s1 || s2 > s3) {
                s2 -= h2.get(0);
                h2.remove(0);
                continue;
            }
            if (s3 > s1 || s3 > s2) {
                s3 -= h3.get(0);
                h3.remove(0);
                continue;
            }
        }
        return s1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n1 = Integer.parseInt(firstMultipleInput[0]);

        int n2 = Integer.parseInt(firstMultipleInput[1]);

        int n3 = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
