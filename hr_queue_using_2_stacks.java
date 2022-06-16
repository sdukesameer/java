import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> st = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            String inp = br.readLine();
            if (inp.startsWith("1")) {
                st.add(Integer.parseInt(inp.substring(2)));
            } else if (inp.startsWith("2")) {
                st.remove(0);
            } else if (inp.startsWith("3")) {
                System.out.println(st.get(0));
            }
        }
    }
}
