package ee.ttu.algoritmid.scoreboard;

import java.util.*;

public class ScoreBoard {

    TreeSet<Participant> set= new TreeSet<>(new PartipComparator());
     List<Participant> l = new ArrayList<Participant>();

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
        int m =n;
        Iterator<Participant> value = set.iterator();
        int start = 0;
        while(start<m && value.hasNext()){
            Participant p = value.next();
            l.add(p);
            start++;
        }
        return l;
    }


}



