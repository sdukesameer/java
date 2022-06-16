import java.io.*;
import java.util.*;

public class hr_arraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),x,y;
        ArrayList<ArrayList<Integer>> all = new ArrayList <ArrayList<Integer>> (n);
        for(int i=0; i<n; i++){
            x=sc.nextInt();
            all.add(new ArrayList<Integer>(x));
            for(int j=0; j<x; j++)
                all.get(i).add(j,sc.nextInt());
        }
        n=sc.nextInt();
        while(n-->0){
            x=sc.nextInt();
            y=sc.nextInt();
            try{
                System.out.println(all.get(x-1).get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}