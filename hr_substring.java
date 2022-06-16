import java.util.Scanner;

public class hr_substring {

    public static String[] sortStrings(String s[]){
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].compareTo(s[j])
                    > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String x = "";
        String[] arr=new String[(s.length()-k)+1];
        for (int i=0; i<=s.length()-k; i++)
            arr[i]=s.substring(i,i+k);
        arr=sortStrings(arr);
        smallest = arr[0];
        largest = arr[arr.length-1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}