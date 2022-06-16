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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        int a=0, b=0, c=0, d=0, e=0, max;
        ArrayList<Integer> res = new ArrayList<Integer>(5);
        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i)==1)
                a++;
            else if (arr.get(i)==2)
                b++;
            else if (arr.get(i)==3)
                c++;
            else if (arr.get(i)==4)
                d++;
            else
                e++;
        }
        max=Math.max(Math.max(Math.max(a,b),Math.max(d,e)),c);
        //System.out.println(max);
        if (max==a)
            res.add(1);
        if (max==b)
            res.add(2);
        if (max==c)
            res.add(3);
        if (max==d)
            res.add(4);
        if (max==e)
            res.add(5);
        Collections.sort(res);
        //System.out.println(res);
        return res.get(0);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
