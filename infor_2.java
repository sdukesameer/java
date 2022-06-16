import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Uncomment below classes to send network request if needed.
// import java.net.HttpURLConnection;
// import java.net.URL;

class infor_2 {
    public static String codeHere(String inputData) {
        // Use this function to write your solution;
        //System.out.println(inputData);
        String[] input = inputData.split("\n");
        String ans = "";
        int t = Integer.parseInt(input[0]);
        int i = 1;
        while (t-- > 0) {
            int n = Integer.parseInt(input[i++]);
            int[][] mat = new int[n][n];
            for (int j = 0; j < n; j++) {
                String[] row = input[i].split(" ");
                i++;
                for (int k = 0; k < row.length; k++) {
                    mat[j][k] = Integer.parseInt(row[k]);
                }
            }
            int res = countOne(mat);
            ans += String.valueOf(res) + "\n";
        }
        return ans;
    }

    public static int countOne(int[][] mat) {
        int count = 0;
        int n = mat.length;
        int cbzero = 0;
        int cizero = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == n - 1 || j == n - 1) && mat[i][j] == 0) {
                    cbzero++;
                } else if (mat[i][j] == 0) {
                    cizero++;
                }
            }
        }

        // System.out.println(cizero);
        // System.out.println(cbzero);
        if (cizero == 0 && cbzero > 0) {
            return -1;
        }

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    int sum = 0;
                    for (int k = 0; k < 4; k++) {
                        int rd = i + dir[k][0];
                        int cd = j + dir[k][1];
                        if (rd >= 0 && cd >= 0 && rd < n && cd < n) {
                            sum += mat[rd][cd];
                        } else {
                            continue;
                        }
                    }
                    if (sum % 2 == 1) {
                        count++;
                    }
                } else {
                    continue;
                }
            }
        }
        if (count == 0) {
            return -1;
        }
        return count;
    }
    public static void main(String args[]) throws Exception {
        String inputData = "";
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null) {
            inputData += thisLine + "\n";
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }


}
