import java.util.*;
public class infor_q1{
    public static String solve(String inputData){
        String ans="";
        boolean repeat=false;
        char buff='0';
        int count=0;
        for(int i=0; i<inputData.length(); i++){
            char c=inputData.charAt(i);
            if(buff==c){
                repeat=true;
                count++;
            }else{
                if(i==0)
                    ans=ans+c+"";
                else
                    ans=ans+count+c+"";
                buff=c;
                count=1;
            }
        }
        ans=ans+count;
        if(repeat)
            return ans+"";
        else
            return 0+"";
    }
    public static void main(String args[]) {
        //String s="ffillltttteeeeerreddd";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
        sc.close();
    }
}
