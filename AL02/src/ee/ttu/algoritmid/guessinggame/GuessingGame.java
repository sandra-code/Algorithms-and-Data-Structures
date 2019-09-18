package ee.ttu.algoritmid.guessinggame;

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
        return oracle.isIt(new City("Delhi", 16787941 ));

    }

    public static void main(String[] args) {
        City[] ArrayOfCities = new City[]{
                new City("Delhi",16787941),
                new City("Madrid",3207247),
                new City("Berlin",3671000)};

        Oracle orc = new Oracle(new City("Delhi", 16787941 ));
        GuessingGame game = new GuessingGame(orc);

        System.out.println(game.play(ArrayOfCities));
    }
}

