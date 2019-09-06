package ee.ttu.algoritmid.fibonacci;

import java.math.BigInteger;

public class AL01A {

    /**
     * Compute the Fibonacci sequence number.
     * @param n The number of the sequence to compute.
     * @return The n-th number in Fibonacci series.
     */
    public  String iterativeF(long n) {

        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;

        for(long i = 3; i<=n; i++){
            c= a.add(b);
            a=b;
            b=c;

        }
        String tulemus = String.valueOf(b);
        return tulemus;
    }

    public static void main(String[] args) {
        AL01A al01A = new AL01A();
        System.out.println(al01A.iterativeF(13));
    }


}