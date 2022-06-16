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
     * Complete the 'funnyString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String funnyString(String s) {
        int i, t=0; String r="";
        for(i=0; i<s.length(); i++)
            r=s.charAt(i)+r;
        for (i=0; i<s.length()-1; i++) {
            //System.out.println(Math.abs((int)s.charAt(i+1) - (int)s.charAt(i)) != Math.abs((int)r.charAt(i+1) - (int)r.charAt(i)));
            if (Math.abs((int)s.charAt(i+1) - (int)s.charAt(i)) != Math.abs((int)r.charAt(i+1) - (int)r.charAt(i))) {
                t=1;
                break;
            }
        }
        //System.out.println(i);
        if(t==1)
            return "Not Funny";
        else
            return "Funny";
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

                String result = Result.funnyString(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
