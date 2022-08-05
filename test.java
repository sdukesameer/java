// { Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){

            int n;
            n = Integer.parseInt(br.readLine());


            int[] arr = IntArray.input(br, n);


            int x;
            x = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.compressArray(n, arr, x);

            System.out.println(res);

        }
    }
}
// } Driver Code Ends


class Solution {
    public static int compressArray(int n, int[] arr, int x) {
        int i=0, j, k;
        while(i<n){
            j=i+1;
            while(j<n){
                if(arr[i]>arr[j] && arr[i]<=arr[j]+x){
                    for(k=j;k<n-1;k++)    arr[k]=arr[k+1];
                    n--;
                }else if(arr[j]>arr[i] && arr[j]<=arr[i]+x){
                    for(k=i;k<n-1;k++)    arr[k]=arr[k+1];
                    n--;
                }else
                    j++;
                Arrays.toString(arr);
            }
            i++;
        }
        return n;
    }
}

