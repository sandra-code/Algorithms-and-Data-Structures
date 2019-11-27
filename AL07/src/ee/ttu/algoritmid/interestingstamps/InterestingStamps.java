package ee.ttu.algoritmid.interestingstamps;

import java.util.ArrayList;
import java.util.List;

public class InterestingStamps {

    public static List<Integer> findStamps(int sum, List<Integer> stampOptions) throws IllegalArgumentException {
        if(sum==0){
            return null;
        }
        if(stampOptions==null){
            return null;
        }
        if(stampOptions.size()-1>sum){
            return stampOptions;
        }
        return findStamps(sum-stampOptions.size()-1, stampOptions);

    }

    public static void main(String[] args) {
        InterestingStamps testclass = new InterestingStamps();
        int sum =100;
        List<Integer> given_stamps = new ArrayList<>();
        given_stamps.add(1);
        given_stamps.add(10);
        given_stamps.add(24);
        given_stamps.add(30);
        given_stamps.add(33);
        given_stamps.add(36);

        System.out.println(testclass.findStamps(sum, given_stamps));
    }
}