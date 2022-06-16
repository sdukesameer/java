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
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static String reverse(String s){
        StringBuffer r = new StringBuffer(s);
        r.reverse();
        return r.toString();
    }

    public static int palindromeIndex(String s) {
        int i;
        String t, r=reverse(s);
        if (s.equals(r));
            return -1;
        
        for (i=0; i<s.length(); i++) {
            if(i-1<0)
                t=s.substring(1,s.length());
            else if(i+1>s.length())
                t=s.substring(0,s.length()-1);
            else{
                t=s.substring(0,i)+s.substring(i+1,s.length());
            }
            if(t.equals(reverse(t)))
                return i;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
