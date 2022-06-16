import java.util.*;

public class hr_1D_array {

public static boolean canWin(int leap, int[] game, int n, int i) {
    if (i==n-1 || (i+leap)>=n)
        return true;
    game[i]=1;
    if (game[i+leap]==0 && canWin(leap,game,n,i+leap))
        return true;
    else if (game[i+1]==0 && canWin(leap,game,n,i+1))
        return true;
    else if (i-1>=0 && game[i-1]==0 && canWin(leap,game,n,i-1))
        return true;
    else
        return false;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, n, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
/*
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0
*/