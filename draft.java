import java.util.*;
import java.io.*;

public class draft {

    public static boolean canWin(int leap, int[] game, int n) {
        Boolean r=false;
        int arr[]=new int[n];
        int i=0;
        while (i < n){
            if (i==n-1 || (i+leap)>=n){
                r=true;
                break;
            }
            else{
                    if (game[i+leap]==0 && arr[i+leap]!=1){
                        arr[i]=1;
                        i+=leap;
                        continue;
                    }
                    else if (game[i+1]==0 && arr[i+1]!=1){
                        arr[i]=1;
                        i++;
                        continue;
                    }
                    else if (i-1>=0 && game[i-1]==0 && arr[i-1]!=1){
                        arr[i]=1;
                        i--;
                        continue;
                    }
                    else
                        r=false;
                        break;
            }
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        String o[]=new String[q];
        int c=0, x=q;
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            if (canWin(leap, game, n))
                o[c++]="YES";
            else
                o[c++]="NO";
        }
        scan.close();
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("code_output.txt"));
        for (int i = 0; i < x; i++){
            outputWriter.write(o[i]+"");
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
    }
}