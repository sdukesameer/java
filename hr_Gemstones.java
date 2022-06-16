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
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
        int i, j, c=0;
        ArrayList<ArrayList<String>> r=new ArrayList<ArrayList<String>>(arr.size());
        for (i=0; i<arr.size(); i++)
            r.add(new ArrayList<String>(arr.get(i).length()));
        //System.out.println(r.size()); correct
        for (i=0; i<arr.size(); i++){
            for (j=0; j<arr.get(i).length(); j++){
                if(!r.get(i).contains(arr.get(i).charAt(j)+"")){
                    r.get(i).add(arr.get(i).charAt(j)+"");
                }
            }
        }
        //System.out.println(r);
        for (i=0; i<r.get(0).size(); i++){
            for (j=1; j<r.size(); j++) 
                if(!r.get(j).contains(r.get(0).get(i)))
                    break;
            if(j==r.size())
                c++;
        }
        return c;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
