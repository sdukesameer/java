import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
class exam_try {
    public static void main(String[] args)thows Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] damange = new int[N][];
        for (int i = 0; i < N; i++) {
            damange[i] = new int[input.nextInt()];
            for (int j = 0; j < damage.length; j++) {
                damage[i][j] = input.nextInt();
            }
        }
        int[] m = new int[N];
        for (int i = 0; i < N; i++) {
            m[i]=0;
            for (int j = 0; i < damage.length; i++ )
                if ( array[i] > array[largest] ) largest = i;
            m[i]=Collections.max(Arrays.asList(damange[i]));
        }
    }
}
