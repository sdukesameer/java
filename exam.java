import java.io.*;
import java.util.*;
import java.lang.Math;
import java.math.BigInteger;

public class exam {
    public static String maximumString(String s) {// 123 45
        if(s.length()==1)
            return s;
        BigInteger max = new BigInteger("0");
        for (int i = 0; i < s.length()-1; i++) {
                String x = Integer.toString((s.charAt(i) - '0') + (s.charAt(i + 1) - '0'));
                String temp = s.substring(0, i) + x + s.substring(i + 2, s.length());
                BigInteger c = new BigInteger(temp);
                if (c.compareTo(max) > 0)
                    max = c;
        }
        return max.toString();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        String result = maximumString(S);
        System.out.println(result);
    }
}

