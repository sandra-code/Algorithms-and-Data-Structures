package ee.ttu.algoritmid.scoreboard;

import java.util.*;

public class ScoreBoard {

    TreeSet<Participant> set= new TreeSet<>(new PartipComparator());

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
         List<Participant> l = new ArrayList<>();
        Iterator<Participant> value = set.iterator();
        int start = 0;
        while(start<n && value.hasNext()){
            Participant p = value.next();
            l.add(p);
            start++;
        }
        return l;
    }
}



