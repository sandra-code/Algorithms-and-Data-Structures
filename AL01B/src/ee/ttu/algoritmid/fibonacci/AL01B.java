package ee.ttu.algoritmid.fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class AL01B {

    /**
     * Estimate or find the exact time required to compute the n-th Fibonacci number.
     * @param n The n-th number to compute.
     * @return The time estimate or exact time in YEARS.
     */
    public String timeToComputeRecursiveFibonacci(int n) {

        /** Calculating the rows with formula: 3 * F(n) - 2 **/
        BigInteger rows = (recursiveF(n).multiply(new BigInteger("3"))).subtract(new BigInteger("2"));

        /** Getting average time of 100 loops**/

        long start = System.nanoTime();
        for (int i = 0; i < 100; ++i) {
            recursiveF(2);
        }
        BigDecimal elapsed = (new BigDecimal(System.nanoTime()).subtract(new BigDecimal(start))).divide(new BigDecimal("100"),2, RoundingMode.HALF_UP);


        /** Calculating the estimated time **/
        BigDecimal time = (new BigDecimal(rows).multiply(elapsed)).divide(new BigDecimal("365"),2, RoundingMode.HALF_UP);
        return String.valueOf(time);
    }

    /**
     * Compute the Fibonacci sequence number recursively.
     * (You need this in the timeToComputeRecursiveFibonacci(int n) function!)
     * @param n The n-th number to compute.
     * @return The n-th Fibonacci number as a string.
     */
    public BigInteger recursiveF(int n) {
        if (n <= 1)
            return BigInteger.valueOf(n);
        return recursiveF(n - 1).add(recursiveF(n - 2));
    }

    public static void main(String[] args) {
        AL01B al01B = new AL01B();
        System.out.println(al01B.timeToComputeRecursiveFibonacci(5));
    }
}
