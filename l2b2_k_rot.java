import java.util.Scanner;

public class l2b2_k_rot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        k = k % n;
        int swap[] = new int[k];
        int c = 0;
        for (int i = n - k; i < n; i++) {
            swap[c++] = arr[i];
        }
        c = n - 1;
        for (int i = n - k - 1; i >= 0; i--) {
            arr[c--] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arr[i] = swap[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
