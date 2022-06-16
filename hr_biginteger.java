import java.io.*;
import java.util.*;
import java.math.*;

public class hr_biginteger {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger A= new BigInteger(sc.next());
        BigInteger B= new BigInteger(sc.next());
        System.out.println(A.add(B));
        System.out.println(A.multiply(B));
    }
}