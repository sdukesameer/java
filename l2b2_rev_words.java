import java.util.Scanner;

public class l2b2_rev_words {
    public static String rev(String s) {
        String ret = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ret += s.charAt(i);
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String inp = sc.nextLine();
        String result="", word="";
        inp += " ";
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch == ' ') {
                result = result + rev(word) + " ";
                word = "";
            } else {
                word += ch;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
