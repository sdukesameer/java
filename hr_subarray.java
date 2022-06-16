import java.io.*;
import java.util.*;

public class hr_subarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        int c=0;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                int s = 0;
                for (int k=i; k<=j; k++){
                    s+=arr[k];
                }
                if (s<0)
                    c++;
            }
        }
        System.out.println(c);
    }
}