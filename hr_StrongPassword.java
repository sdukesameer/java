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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        int nc=0, uc=0, lc=0, sc=0, ans;
        char ch;
        for (int i=0; i<password.length(); i++) {
            ch=password.charAt(i);
            if (Character.isLowerCase(ch))
                lc=1;
            else if (Character.isUpperCase(ch))
                uc=1;
            else if (Character.isDigit(ch))
                nc=1;
            else if (ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*' || ch=='(' || ch==')' || ch=='-' || ch=='+')
                sc=1;
        }
        ans=4-(nc+uc+lc+sc);
        if (n<6 && (6-n)>ans)
            return 6-n;
        else
            return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String password = bufferedReader.readLine();

        int answer = Result.minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
