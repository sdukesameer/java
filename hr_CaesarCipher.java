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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
        k%=26;
        char ch;
        String ret="";
        for (int i=0; i<s.length(); i++) {
            ch=s.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isUpperCase(ch) && ((int) ch + k) > 90)
                    ret+=(char) (((int)ch+k)-26);
                else if (Character.isLowerCase(ch) && ((int) ch + k) > 122)
                    ret+=(char) (((int)ch+k)-26);
                else
                    ret+=(char) ((int)ch+k);
            }
            else
                ret+=ch;
        }
        return ret;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
