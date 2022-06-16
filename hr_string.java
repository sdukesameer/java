import java.io.*;
import java.util.*;

public class hr_string {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if (B.compareTo(A)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        for(int i=0; i<A.length(); i++){
            if (i==0)
                System.out.print(Character.toUpperCase(A.charAt(i)));
            else
                System.out.print(A.charAt(i));
        }
        System.out.print(" ");
        for(int j=0; j<B.length(); j++){
            if (j==0)
                System.out.print(Character.toUpperCase(B.charAt(j)));
            else
                System.out.print(B.charAt(j));
        }
    }
}