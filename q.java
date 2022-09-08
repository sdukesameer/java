import java.util.*;
public class q{
    public static void main(String[] args){
        q test=new q();
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        in.close();
        String s=Integer.toString(num);
        test.isPalindrome(s);
    }
    void isPalindrome(String s){
        String rev="";
        for (int i=0; i<s.length(); i++){
            rev=s.charAt(i)+rev;
        }
        if(s.compareTo(rev)==0){
            System.out.println("The number is a palindrome!");
        }else{
            System.out.println("Not a palindrome!");
        }
    }

}
