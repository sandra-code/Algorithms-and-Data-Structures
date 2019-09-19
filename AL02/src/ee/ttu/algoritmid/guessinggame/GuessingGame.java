package ee.ttu.algoritmid.guessinggame;

import java.util.Arrays;
import java.util.Comparator;

public class GuessingGame {

    Oracle oracle;

    public GuessingGame(Oracle oracle) {
        this.oracle = oracle;
    }

    /**
     * @param cityArray - All the possible cities.
     * @return the name of the city.
     */
    public String play(City[] cityArray) {

        /** Sorting the array**/
        Arrays.sort(cityArray, Comparator.comparing(City::getPopulation));

        /** Searching the city**/
        int low =1;
        int high = cityArray.length-1;
        /**int mid = (low+high)/2;

        while(oracle.isIt(cityArray[mid])!="correct!"){
            if(oracle.isIt(cityArray[mid])=="lower population"){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            if(low<=high){
                mid =  (low+high)/2;
            }

        }**/
        int mid =0;
        while(low<= high){
            mid = (low+high)/2;

            if(oracle.isIt(cityArray[mid])=="correct!"){
                return  cityArray[mid].getName();
            }

            if(oracle.isIt(cityArray[mid])=="higher population"){
                low = mid +1;
            }
            if(oracle.isIt(cityArray[mid])=="lower population"){
                low = mid -1;
            }
        }

        return "city not found";

    }

    public static void main(String[] args) {

        //Madrid, Berlin, Yokohama, Giza, Hong Kong, New York, Tokyo, Dehli

        City[] listOfCities = new City[]{
                new City("Dehli", 16787941),
                new City("Berlin", 3671000),
                new City("Madrid", 3207247),
                new City("Hong Kong", 7298600),
                new City("New York", 8537673),
                new City("Tokyo", 13513734),
                new City("Giza", 4239988),
                new City("Yokohama", 3726167)
        };

        GuessingGame guessingGame = new GuessingGame(new Oracle(listOfCities[0])); //dehli
        System.out.println(guessingGame.play(listOfCities)); //dehli

    }

}