/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cc_q2{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t ;i++ ){
				int n=sc.nextInt();
				int s=sc.nextInt();
				int l=-1;
				for (int j=0;j<=s ;j++ ){
					for (int k=0;k<=s ;k++ ){
						if(j+k>s)
							break;
						if (j+k==s && l<(Math.abs(j-k)))
							l=Math.abs(j-k);
					}
				}
				System.out.println(l);
			} 
	}
}
