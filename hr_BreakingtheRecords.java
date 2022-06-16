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
    public static List<Integer> breakingRecords(List<Integer> scores) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        int max=scores.get(0), min=scores.get(0);
        res.add(0);//max_count
        res.add(0);//min_count
        for(int i=1; i<scores.size();i++){
            if (scores.get(i)>max){//record broken
                res.set(0,res.get(0)+1);//record count inremented
                max=scores.get(i);//new record set
            }
            if (scores.get(i)<min){//record broken
                res.set(1,res.get(1)+1);//record count inremented
                min=scores.get(i);//new record set
            }
        }
        return res;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
