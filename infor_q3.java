import java.util.*;
public class infor_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] in = input.split("\n");
        String str = in[0].toUpperCase();
        int n = Integer.parseInt(in[1]);
        int i=2;
        while(n-->0){
        String s1 = in[i++].toUpperCase();
        int len = s1.length();
        for(int j=0; j<str.length()-len; j++){
            String sub = str.substring(j, j+len);
            StringBuffer sb = new StringBuffer();
            if(sub.equals(s1)==true){
                String temp1= str.substring(0, j);
                String temp2= str. substring(len+j, str.length());
                if(temp1.length()>0){
                    sb.append(temp1+" ");
                }
                sb.append(sub.toLowerCase()+" ");
                if(temp2.length()>0){
                    sb.append(temp2+" ");
                }
                j = len;
                System.out.println(sb.toString());
            }
        }
    }
    }
}
