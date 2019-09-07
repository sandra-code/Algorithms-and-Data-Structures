package ee.ttu.algoritmid.fibonacci;

import java.math.BigInteger;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class AL01B {

    /**
     * Estimate or find the exact time required to compute the n-th Fibonacci number.
     * @param n The n-th number to compute.
     * @return The time estimate or exact time in YEARS.
     */
    public String timeToComputeRecursiveFibonacci(int n) {
        long start = System.currentTimeMillis();
        recursiveF(n);
        long elapsedTime = System.currentTimeMillis()-start;
        long convert = (TimeUnit.DAYS.convert(elapsedTime, TimeUnit.NANOSECONDS))/365;
        return String.valueOf(convert);
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
        System.out.println(al01B.timeToComputeRecursiveFibonacci(10));
    }
}
