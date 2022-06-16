import java.util.*;
public class elitmus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, s = -1, e = -1, c;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sort = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sort[i] = arr[i];
        }
        Arrays.sort(sort);
        if (Arrays.equals(arr, sort)) {
            System.out.println("-1 -1");
            return;
        }
        for (i = 0; i < n; i++) {
            if (arr[i] != sort[i]) {
                s = i + 1;
                break;
            }
        }
        for (i = n - 1; i >= 0; i--) {
            if (arr[i] != sort[i]) {
                e = i + 1;
                break;
            }
        }
        System.out.println(s + " " + e);
    }
}
