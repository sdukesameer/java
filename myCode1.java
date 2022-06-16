import java.io.*;
import java.util.Scanner;
public class myCode1 {
    public static void main(String[] args) throws java.lang.Exception {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] inpArr = inp.split(",");
        int[] inpArrInt = new int[inpArr.length];
        int [] outArr = new int[inpArr.length-1];
        for (int i = 0; i < inpArr.length; i++) {
            inpArrInt[i] = Integer.parseInt(inpArr[i]);
        }
        int[] inpArrIntSorted = new int[inpArr.length];
        for (int i = 0; i < inpArr.length; i++) {
            if (inpArrInt[i] < 0)
                inpArrIntSorted[c++] = inpArrInt[i];
        }
        for (int i = 0; i < inpArr.length; i++) {
            if (inpArrInt[i] >= 0)
                inpArrIntSorted[c++] = inpArrInt[i];
        }
        c = 0;
        int sum;
        for (int i = 0; i < inpArr.length - 1; i++) {
            sum = 0;
            if (inpArrIntSorted[i + 1] - inpArrIntSorted[i] <= 1) {
                outArr[c++] = 0;
            } else {
                for (int j = inpArrIntSorted[i] + 1; j < inpArrIntSorted[i + 1]; j++)
                    sum += j;
                outArr[c++] = sum;
            }
        }
        for (int i = 0; i < outArr.length; i++) {
            System.out.print(outArr[i] + ",");
        }
    }
}
