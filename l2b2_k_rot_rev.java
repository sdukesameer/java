import java.util.Scanner;

public class l2b2_k_rot_rev {
    public static void rev(int arr[], int s, int e) {
        while(s<e){
            int t = arr[s];
            arr[s++] = arr[e];
            arr[e--] = t;
        }
    }
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
        rev(arr, 0, n-k-1);
        rev(arr, n-k, n-1);
        rev(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
