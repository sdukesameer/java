import java.util.*;
class cc_q3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),x,i,j,k,l;
		for (i=0;i<t;i++){
            x=0;
            int n=sc.nextInt();
            int s=sc.nextInt();
            for (j=1;j<=n;j++){
                int cs=(n*(n+1)/2)-j;
                if(cs==s){
                    System.out.println(j);
                    x=1;
                }
            }
            if(x==0)
                System.out.println("-1");
        }
        sc.close();
    }
}
