import java.util.*;
class my{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int A[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(largestBinary(m, n, A));
    }

    public static int largestBinary(int input1, int input2, int[][] input3) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input2; j++) {
                if (input3[i][j] == 0) {
                    sb.append("0");
                } else {
                    sb.insert(0,"1");
                }
            }
        }
        int n = Integer.parseInt(sb.toString(), 2);
        return n % 1000000007;
    }
}
