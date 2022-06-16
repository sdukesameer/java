import java.util.Scanner;

public class elitmus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, s=-1, e=-1, c;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0; i<n; i++)
            arr[i] = sc.nextInt();
        i = 0; c = 0;
        while (i!=n-1 && arr[i] < arr[i + 1]) {
            i++;
            c = 1;
        }
        if (c==1 && i!=n-1)
            s = i + 1;
        i = n - 1; c = 0;
        while (i!=0 && arr[i] > arr[i - 1]) {
            i--;
            c = 1;
        }
        if (c==1 && s!=-1)
            e = i + 1;
        System.out.println(s + " " + e);
    }
}
