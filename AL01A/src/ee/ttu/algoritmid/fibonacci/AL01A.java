package ee.ttu.algoritmid.fibonacci;

public class AL01A {

    /**
     * Compute the Fibonacci sequence number.
     * @param n The number of the sequence to compute.
     * @return The n-th number in Fibonacci series.
     */
    public  String iterativeF(int n) {

        long a = 1;
        long b = 1;
        long c;

        for(long i = 3; i<=n; i++){
            c= a+b;
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