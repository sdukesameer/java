import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "";
        List<String> st = new ArrayList<String>(n);
        st.add(s);
        for (int i = 0; i < n; i++) {
            String inp = br.readLine();
            if (inp.startsWith("1")) {
                s += inp.substring(2);
                st.add(s);
            } else if (inp.startsWith("2")) {
                s = s.substring(0, s.length() - Integer.parseInt(inp.substring(2)));
                st.add(s);
            } else if (inp.startsWith("3")) {
                System.out.println(s.charAt(Integer.parseInt(inp.substring(2)) - 1));
            } else if (inp.startsWith("4")) {
                st.remove(st.size() - 1);
                s = st.get(st.size() - 1);
            }
        }
    }
}
