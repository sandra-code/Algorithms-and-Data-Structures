package ee.ttu.algoritmid.scoreboard;

import java.util.List;
import java.util.TreeSet;

public class ScoreBoard {

    TreeSet<Participant> set= new TreeSet<Participant>();
    /**
     * Adds a participant's time to the checkpoint scoreboard
     */
    public void add(Participant participant) {
        set.add(participant);
    }

    /**
     * Returns top n number of participants in the checkpoint to be displayed on the scoreboard
     * This method will be queried by the tests every time a new participant is added

     */
    public List<Participant> get(int n) {

        return null;
    }
}


