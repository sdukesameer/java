import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            String out = "";
            String t = "";
            int num = 0;
            for(int i = 0; i < n; i++){//dive1diver2
                char ch = s.charAt(i);
                //System.out.println(ch);
                if(Character.isDigit(ch)){
                    num = num * 10 + (ch - '0');
                    if(i+1 < n && !Character.isDigit(i+1)){
                        for(int j = 0; j < num; j++)
                            out += t;
                        t = "";
                        num = 0;
                    }
                    if(i+1==n) {
                        for(int j = 0; j < num; j++)
                            out += t;
                    }
                }else{
                    t+=ch;
                }
            }
            System.out.println(out);
        }
    }
}
