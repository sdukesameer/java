import java.util.*;
class cc_q4{
    static int cal(int p, int n){
        if(p>=1 && n>=1)
            return 2;
        else if ((p>=1 && n==0) || (p==0 && n>=1))
            return 1;
        else
            return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0; i<t; i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            int arr1[]=new int[n];
            for (int j=0; j<n; j++){
                arr[j]=sc.nextInt();
                arr1[j]=0;
            }
            while(k-->0){
                for (int j=0; j<n; j++){
                    if (j==0)
                        arr1[j]=arr[j]+cal(arr[n-1],arr[j+1]);
                    else if(j==n-1)
                        arr1[j]=arr[j]+cal(arr[j-1],arr[0]);
                    else
                        arr1[j]=arr[j]+cal(arr[j-1],arr[j+1]);
                }
                for (int j=0; j<n; j++){
                    arr[j]=arr1[j];
                    arr1[j]=0;
                }
            }
            int sum=0;
            for (int j=0; j<n; j++){
                sum+=arr[j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
