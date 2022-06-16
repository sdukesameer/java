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
     * Complete the 'anagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int anagram(String s) {
        if(s.length()%2!=0)
            return -1;
        int i, c=0;
        ArrayList<String> a=new ArrayList<String>(s.length()/2);
        ArrayList<String> b=new ArrayList<String>(s.length()/2);
        for (i=0; i<s.length()/2; i++) {
            a.add(s.charAt(i)+"");
            b.add(s.charAt(i+(s.length()/2))+"");
        }
        Collections.sort(a); Collections.sort(b);
        //System.out.println(a+" "+b);
        for (i=0; i<a.size(); i++){
            if(!b.contains(a.get(i)))
                c++;
            else{
                b.remove(a.get(i));
            }
            //System.out.println(a+" "+b);
        }
        return c;
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

                int result = Result.anagram(s);

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
