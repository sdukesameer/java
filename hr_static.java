import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hr_static {
    static Boolean flag;
    static int B,H;
    static{
        flag=true;
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if (H<=0 || B<=0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

