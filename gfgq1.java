import java.util.Scanner;

class gfgq1 {
    public static int check(String s) {
        int u=0,l=0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                u++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                l++;
            }
        }
        if (u==l) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (check(s.substring(i, j)) == 1)
                    count++;
            }
        }
        System.out.println(count);
    }
}
