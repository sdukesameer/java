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
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        int t=1;
        char ch, ch1;
        String n;
        while(t==1){
            t=0; n=""; s=s+" ";
            for (int i=0; i<s.length()-1; i++) {
                ch=s.charAt(i);
                ch1=s.charAt(i+1);
                if (ch==ch1){
                    i++;
                    t=1;
                    continue;
                }
                else
                    n+=ch;
            }
            s=n;
        }
        if (s.length()==0)
            return "Empty String";
        else
            return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
