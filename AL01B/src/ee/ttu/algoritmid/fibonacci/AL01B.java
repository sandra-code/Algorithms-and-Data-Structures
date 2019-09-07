package ee.ttu.algoritmid.fibonacci;

import java.math.BigInteger;

public class AL01B {

    /**
     * Estimate or find the exact time required to compute the n-th Fibonacci number.
     * @param n The n-th number to compute.
     * @return The time estimate or exact time in YEARS.
     */
    public String timeToComputeRecursiveFibonacci(int n) {
        return Double.toString(oneLoopTest(n));
    }

    /** Finding the years using golden ratio formula ϕ=(1+5√)/2
     * Converting nanoseconds to milliseconds
     * 31536000 is seconds in a year
     * Golden ratio is base and i is n-th Fibonacci nr
     **/

    public double oneLoopTest(int i){
        double goldenRatio = (1+Math.sqrt(5))/2;
        long timer = timerFunction();
        double t = 10e9/timer;
        return (Math.pow(goldenRatio,i)/t)/31536000;

    }

    /** Calculates how long does it take to go through 1 recursive loop **/
    public long timerFunction(){
        long start = System.nanoTime();
        recursiveF(1);
        long stop = System.nanoTime();
        return stop-start;
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
        System.out.println(al01B.timeToComputeRecursiveFibonacci(69));
    }
}
