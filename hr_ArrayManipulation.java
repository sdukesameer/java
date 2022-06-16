import java.util.*;
public class hr_ArrayManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, x, y, z, n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        long arr[] = new long[n+1];
        for (i = 0; i <= n; i++)
            arr[i]=0;// initialise array with 0
        for (i = 0; i < m; i++) {// no of queries
            x = sc.nextInt();//start
            y = sc.nextInt();//end
            z = sc.nextInt();//value
            arr[x - 1] += (long) z;
            arr[y] -= (long) z;
        }
        long sum = 0L, max = 0L;
        for (i = 0; i < n; i++) {
            sum+=arr[i];
            if (sum > max)
                max = sum;
        }
        System.out.println(max);
        sc.close();
    }
}
