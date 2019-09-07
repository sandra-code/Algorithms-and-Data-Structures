package ee.ttu.algoritmid.fibonacci;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class AL01B {

    /**
     * Estimate or find the exact time required to compute the n-th Fibonacci number.
     * @param n The n-th number to compute.
     * @return The time estimate or exact time in YEARS.
     */
    public String timeToComputeRecursiveFibonacci(int n) {
        return Double.toString(oneLoopTest(n));
    }


    public double oneLoopTest(int i){
        double n = (1+Math.sqrt(5))/2;
        long a = onefuncal();
        double t = 10e9/a;
        double ans = (Math.pow(n,i)/t)/31557600;
        return ans;

    }

    public long onefuncal(){
        long startTime = System.nanoTime();
        recursiveF(1);
        long stopTime = System.nanoTime();

        return stopTime-startTime;

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
        System.out.println(al01B.timeToComputeRecursiveFibonacci(20));
    }
}
