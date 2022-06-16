/*
_  _        _
 \/ \      /
     \  /\/
      \/
0 -1 0 -1 -2 -3 -2 -1 -2 -1 0  
   D U  D  D  D  U  U  D  U U  

     /\/\
    /    \
_/\/      \

its the no of times surface is visited after downhill.
*/
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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        char ch;
        int i, res=0, dh=0;
        for (i=0; i<path.length(); i++){
            ch=path.charAt(i);
            if (ch=='D'){
                dh-=1;
            }
            if (ch=='U'){
                dh+=1;
                if(dh==0){
                    res++;
                }
            }
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
